package steps;

import hooks.Hooks;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.login.LoginPage;

import java.io.IOException;

import static hooks.Hooks.props;
import static hooks.Hooks.wait;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() throws IOException {
        this.driver= Hooks.driver;
        this.loginPage = new LoginPage(driver, wait);
    }

    @Given("the user opens jamtangan.com website")
    public void theUserOpensJamtanganComWebsite() {
        Assert.assertNotNull("Page title is null", loginPage.enterWeb());
    }

    @When("the user clicks the popups")
    public void theUserClicksThePopups() {
        loginPage.clickPopups();
    }

    @And("the user clicks the 'Masuk' button")
    public void theUserClicksTheMasukButton() {
        loginPage.clickMasukButton();
    }

    @And("the user inserts a valid username and password")
    public void theUserInsertsAValidUsernameAndPassword() {
        loginPage.enterUsername(props.getProperty("data-login-email"));
        loginPage.enterPassword(props.getProperty("data-login-password"));
    }

    @And("the user clicks the 'Masuk' popup button")
    public void theUserClicksMasukPopupButton() {
        loginPage.clickMasukPopupButton();
    }

    @And("the user is redirected to the home page")
    public void theUserIsRedirectedToTheHomePage() throws InterruptedException {
        Assert.assertTrue(loginPage.verifyProfileMenuIsDisplayed());
        Assert.assertFalse("The page title is empty!", loginPage.getWebTitle().isEmpty());
        System.out.println("Current title is: " + loginPage.getWebTitle());

//        Thread.sleep(75000);
//        loginPage.closePopUp();
    }
}