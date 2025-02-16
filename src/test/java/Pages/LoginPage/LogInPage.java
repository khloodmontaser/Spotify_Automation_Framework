package Pages.LoginPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    BrowserActions browserActions;
    Assertion assertion;

    public LogInPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By EmailField = By.id("login-username");
    By passwordField = By.id("login-password");
    By loginButton = By.id("login-button");

    public void enterEmail(String mail){
        browserActions.type(EmailField, mail);

    }
    public void enterPassword(String password){
        browserActions.type(passwordField, password);

    }
    public void clickLoginButton(){browserActions.click(loginButton);}

    public void fillLoginData(String email , String password){
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

}
