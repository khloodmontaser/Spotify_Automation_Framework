package Tests.TestCases;

import Config.Config;
import Pages.guestPage.mainPage;
import Pages.signUpPage.SignUpPage;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signUp extends TestBase {
    String url = Config.getProperty("URL");
    mainPage mainPage;
    SignUpPage signUp;

    @BeforeMethod
    public void setupTest() {
        mainPage = new mainPage(driver);
        signUp = new SignUpPage(driver);
        mainPage.navigateTourl(url);
    }

    @Test
    public void signUpOnSpotifyWithValidCredentials() {
        // Test Data
        String email = "testuser33632@example.com";
        String password = "Test@##1234";
        String name = "Test User";
        String day = "15";
        String month = "March";
        String year = "1998";
        String gender = "male";

        mainPage.clickSignUpButton();

        signUp.enterEmail(email);
        signUp.clickNext();

        signUp.enterPassword(password);
        signUp.clickNext();

    }
}
