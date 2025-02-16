package Pages.guestPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage {
    BrowserActions browserActions;
    Assertion assertion;
    public mainPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By LoginButton = By.xpath("//*[@id=\"global-nav-bar\"]/div[3]/div[2]/button[2]");
    By SignUpButton = By.xpath("//button[@data-testid=\"signup-button\"]");


    //Actions
    public void navigateTourl(String url){browserActions.navigateToURl(url);}
    public void clickLoginButton(){
        browserActions.click(LoginButton);
    }
    public void clickSignUpButton(){
        browserActions.click(SignUpButton);
    }


}
