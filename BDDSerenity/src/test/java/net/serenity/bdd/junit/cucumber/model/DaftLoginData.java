package net.serenity.bdd.junit.cucumber.model;

/**
 * Created by arunkumar on 26-05-2017.
 */
public class DaftLoginData {

    //Valid Details
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //Invalid Details
    private String usernameInvalid;

    public String getUsernameInvalid() {
        return usernameInvalid;
    }

    public void setUsernameInvalid(String usernameInvalid) {
        this.usernameInvalid = usernameInvalid;
    }

    private String passwordInvalid;

    public String getPasswordInvalid() {
        return passwordInvalid;
    }

    public void setPasswordInvalid(String passwordInvalid) {
        this.passwordInvalid = passwordInvalid;
    }

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
