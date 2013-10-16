package controllers;

import fr.nemak3.core.Player;
import fr.nemak3.db.Dao;
import fr.nemak3.services.LoginService;
import org.codehaus.jackson.JsonNode;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class LoginCtrl extends Controller {

    @Transactional
    public static Result login() {

        JsonNode jsBody = request().body().asJson();
        JsonNode jsLogin = jsBody.get("login");
        JsonNode jsPwd = jsBody.get("pwd");

        if(jsLogin == null || jsPwd == null){
            return badRequest("Arg is missing.");
        }

        String login = jsLogin.asText();
        String pwd = jsPwd.asText();

        if( (login == null || login.isEmpty()) || (pwd == null || pwd.isEmpty()) ){
            return badRequest("Arg is missing.");
        }

        Player player = LoginService.getInstance().login(Dao.getInstance(), login, pwd);
        if(player == null){
            badRequest("Login failed.");
        }

        JsonNode res = Json.toJson(player);
        return ok(res);
    }
}
