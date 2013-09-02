package controllers;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created with IntelliJ IDEA.
 * User: Patricia
 * Date: 02/09/13
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class LoginCtrl extends Controller {

    @Transactional
    public static Result login() {



        return ok();
    }
}
