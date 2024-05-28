package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {

    private final SelenideElement usernameFld = $(By.id("user-name"));
    private final SelenideElement passwordFld = $(By.id("password"));
    private final SelenideElement loginBtn = $(By.id("login-button"));

    public void enterUsername(String username){
        usernameFld.should(Condition.appear).sendKeys(username);
    }


    public void enterPassword(String password) {
        passwordFld.should(Condition.appear).sendKeys(password);
    }

    public void clickToLogin() {
        loginBtn.should(Condition.clickable).click();
    }
}