import fr.nemak3.tools.LoggerUtils;
import org.codehaus.jackson.JsonNode;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.Json;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.lang.reflect.Method;

import static play.mvc.Results.internalServerError;

public class Global extends GlobalSettings {

    @Override
    public void onStart(Application application) {
        super.onStart(application);
    }

    @Override
    public Action onRequest(Http.Request request, Method actionMethod) {

        Logger.info(
                "Request from " + request.username() + "@" + request.remoteAddress() + " for " +
                request.toString() + ", action is " + displayAction(actionMethod)
        );

        String path = request.path();
        if (path.startsWith("/secure")) {

            return new Action() {
                @Override
                public Result call(Http.Context context) throws Throwable {
                    // see http://stackoverflow.com/questions/49547/making-sure-a-web-page-is-not-cached-across-all-browsers
                    context.response().setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
                    String playerId = context.session().get("PLAYER_ID");
                    if (playerId == null) {
                        return unauthorized();
                    } else {
                        return delegate.call(context);
                    }
                }
            };
        }

        return super.onRequest(request, actionMethod);
    }

    @Override
    public Result onError(Http.RequestHeader request, Throwable t) {
        String sErrorMsg = "Unexpected situation \n" + LoggerUtils.throwableToString(t);
        JsonNode errorMsg = Json.toJson(sErrorMsg);
        return internalServerError(errorMsg);
    }

    private String displayAction(Method actionMethod) {
        StringBuilder result = new StringBuilder();
        result.append(actionMethod.getDeclaringClass().getCanonicalName()).append(".").append(actionMethod.getName()).append("(");
        Class<?>[] parameterTypes = actionMethod.getParameterTypes();
        if(parameterTypes.length!=0) {
            for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> aClass = parameterTypes[i];
                result.append(aClass.getCanonicalName());
                if(i!=parameterTypes.length-1) result.append(",");
            }
        }
        result.append(")");
        return result.toString();
    }
}
