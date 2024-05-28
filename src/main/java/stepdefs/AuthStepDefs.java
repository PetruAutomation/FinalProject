package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AuthPage;

public class AuthStepDefs {

    AuthPage authPage = new AuthPage();

    @When("user enter {string} username")
    public void enterUsername(String username){
        authPage.enterUsername(username);
    }


    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        authPage.enterPassword(password);
    }

    @And("user click to Login button")
    public void userClickToLoginButton() {
        authPage.clickToLogin();
    }
}