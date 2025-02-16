package Tests.TestCases;

import Config.Config;
import Pages.LoginPage.LogInPage;
import Pages.guestPage.mainPage;
import Pages.signUpPage.SignUpPage;
import Tests.TestBase;
import Utilities.JSONReader;
import Utilities.Utilities;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    String url = Config.getProperty("URL");
    Pages.guestPage.mainPage mainPage;
    SignUpPage signUp;
    LogInPage logInPage;

    @BeforeMethod
    public void setupTest() {
        mainPage = new mainPage(driver);
        signUp = new SignUpPage(driver);
        logInPage = new LogInPage(driver);
        mainPage.navigateTourl(url);
    }

    @Test
    public void LogInOnSpotifyWithValidCredentials() {
        // Read test data from JSON file
        JSONObject credentials = JSONReader.getTestData("C:\\Users\\Administrator\\Desktop\\Deliverables\\Spotify_Automation_Framework\\src\\main\\java\\Utilities\\testData\\Credentials.json");

        String email = Utilities.generateRandomString(8) + "@gmail.com";
        String password = (String) credentials.get("password");
        String name = (String) credentials.get("name");
        String day = (String) credentials.get("day");
        String month = (String) credentials.get("month");
        String year = (String) credentials.get("year");
        String gender = (String) credentials.get("gender");

        mainPage.clickSignUpButton();
        signUp.fillSignUpForm(email, password, name, day, month, year, gender);

        //logout

        //login with same credentials
        logInPage.fillLoginData(email, password);



    }
}
