package models;

import fr.marco46.DaoObject;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 21/07/13
 * Time: 19:53
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User extends DaoObject {

    private String login;
    private String pwd;
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {

    }
}
