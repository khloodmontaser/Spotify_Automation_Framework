package Pages.HomePage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    BrowserActions browserActions;
    Assertion assertion;

    public HomePage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }
    By profileICON = By.xpath("//*[@id=\"global-nav-bar\"]/div[3]/button/span");
    By logOutLink = By.xpath("//*[@id=\"context-menu\"]/div/ul/li[7]/button");

    public void clickOnProfileIcon(){
        browserActions.click(profileICON);
    }

    public void logOut(){
        clickOnProfileIcon();
        browserActions.click(logOutLink);
    }
    public void isProfileExist(){
        assertion.assertElementIsDisplayed(profileICON);
    }




}
