package controllers;

import org.junit.Test;
import play.mvc.Result;

import static play.test.Helpers.callAction;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 08/09/13
 * Time: 17:27
 * To change this template use File | Settings | File Templates.
 */
public class LoginCtrlTest {
    @Test
    public void testLoginCtrl() {
        /*running(fakeApplication(), new Runnable() {
            public void run() {
                Result result = callAction(
                        routes.ref.LoginCtrl.login
                );
            }
        });

        assertThat(status(result)).isEqualTo(OK);
        assertThat(contentType(result)).isEqualTo("text/html");
        assertThat(charset(result)).isEqualTo("utf-8");
        assertThat(contentAsString(result)).contains("Hello Kiki");  */
    }
}
