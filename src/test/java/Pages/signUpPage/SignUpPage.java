package Pages.signUpPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    BrowserActions browserActions;
    Assertion assertion;

    public SignUpPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By EmailField = By.id("username");
    By NextButton = By.xpath("//span[text()='Next']");
    By PasswordField = By.id("new-password");
    By NameField = By.id("displayName");
    By dayField = By.id("day");
    By monthMenu = By.id("month");
    By yearField = By.id("year");
    By closeCookies = By.xpath("/html/body/div[3]/div[2]/div/div[2]/button");

    public By genderRadioButton(String gender) {
        return By.xpath(String.format("//input[@name='gender' and @value='%s']", gender));
    }

    By SignUpButton = By.xpath("//span[text() = 'Sign up']");

    //Actions
    public void enterEmail(String email) {
        browserActions.type(EmailField, email);
    }

    public void clickNext() {
        browserActions.click(NextButton);
    }

    public void enterPassword(String password) {
        browserActions.type(PasswordField, password);
    }

    public void enterName(String name) {
        browserActions.type(NameField, name);
    }

    public void enterDay(String day) {
        browserActions.type(dayField, day);
    }

    public void selectMonth(String month) {
        browserActions.selectDropdownByVisibleText(monthMenu, month);
    }

    public void enterYear(String year) {
        browserActions.type(yearField, year);
    }

    public void selectGender(String gender) {
        browserActions.click(genderRadioButton(gender));
    }
    public void clickSignUp(){browserActions.click(SignUpButton);}
    // Combined method to fill the entire form
    public void fillSignUpForm(String email, String password, String name, String day, String month, String year, String gender) {
        closeCookiesPopUp();
        enterEmail(email);


        clickNext();

        enterPassword(password);
        clickNext();
        enterName(name);
        enterDay(day);
        selectMonth(month);
        enterYear(year);
        selectGender(gender);
        clickNext();
        clickSignUp();
    }
    public void closeCookiesPopUp(){
        browserActions.click(closeCookies);
    }



}
