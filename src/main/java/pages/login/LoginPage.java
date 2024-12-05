package pages.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//button[text()='OKE']")
    private WebElement okeButton;

    @FindBy(xpath = "//button[@id='optInText']")
    private WebElement izinkanButton;

    @FindBy(xpath = "//button[text()='Masuk']")
    private WebElement masukButton;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkboxButton;

    @FindBy(xpath = "(//button[text()='Masuk'])[2]")
    private WebElement signInButton;

    @FindBy(xpath = "//img[@alt='User avatar icon']")
    private WebElement profileMenu;

//    @FindBy(xpath = "//*[@aria-label='Close']")
//    private WebElement closePopUp;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public String enterWeb(){
        String a = driver.getTitle();
        System.out.println("Current web title is: " + a);
        return a;
    }

    public void clickPopups() {
        wait.until(ExpectedConditions.visibilityOf(okeButton));
        okeButton.click();
        wait.until(ExpectedConditions.visibilityOf(izinkanButton));
        izinkanButton.click();
    }

    public void clickMasukButton() {
        wait.until(ExpectedConditions.visibilityOf(masukButton));
        masukButton.click();
    }

    public void enterUsername(String text) {
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(text);
    }

    public void enterPassword(String text) {
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(text);
    }

    public void clickMasukPopupButton() {
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        checkboxButton.click();
        signInButton.click();
    }

    public boolean verifyProfileMenuIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(profileMenu));
        boolean a = profileMenu.isDisplayed();
        return a;
    }

    public String getWebTitle() {
        String pageTitle = driver.getTitle();
        return pageTitle;
    }

//    public void closePopUp() {
////        wait.until(ExpectedConditions.visibilityOf(closePopUp));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closePopUp);
//        closePopUp.click();
//    }
}