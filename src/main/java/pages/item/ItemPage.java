package pages.item;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @FindBy(xpath = "//*[@placeholder='Cari di Jamtangan.com']")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@data-testid='search-content__brand-item']")
    private WebElement brandLogo;

    @FindBy(xpath = "(//*[@class='mr-2'])[3]")
    private WebElement popularSearchBrand3rd;

    @FindBy(xpath = "//*[@data-testid='filter-nav-item-jam-tangan-wanita']")
    private WebElement kategoriFilterWanita;

    @FindBy(xpath = "//*[@data-testid='filter-nav-item-jam-tangan-pria']")
    private WebElement kategoriFilterPria;

    @FindBy(xpath = "//*[@data-testid='filter-checkbox-input']")
    private WebElement brandField;

    @FindBy(xpath = "//*[@for='filter-brand-seiko']")
    private WebElement brandFilterSeiko;

    @FindBy(xpath = "//*[@for='filter-price_-1000000-5000000']")
    private WebElement hargaFilter1Sd5Jt;

    @FindBy(xpath = "//*[@for='filter-style-dress']")
    private WebElement styleFilterDress;

    @FindBy(xpath = "//*[@for='filter-style-sport']")
    private WebElement styleFilterSport;

    @FindBy(xpath = "//*[@for='filter-movement-quartz-battery']")
    private WebElement movementFilterQuartz;

    @FindBy(xpath = "//*[@for='filter-movement-automatic']")
    private WebElement movementFilterAutomatic;

    @FindBy(xpath = "//*[text()='Case Diameter']")
    private WebElement diameterHeader;

    @FindBy(xpath = "//*[@data-testid='filter-tag-28 - 30']")
    private WebElement diameterFilter28Sd30;

    @FindBy(xpath = "//*[@data-testid='filter-tag-40 - 42']")
    private WebElement diameterFilter40Sd42;

    @FindBy(xpath = "//*[text()='Warna']")
    private WebElement colorHeader;

    @FindBy(xpath = "//*[@data-testid='filter-color-silver']")
    private WebElement colorFilterSilver;

    @FindBy(xpath = "//*[@data-testid='filter-color-hitam']")
    private WebElement colorFilterHitam;

    @FindBy(xpath = "//*[text()='Dial Display']")
    private WebElement dialHeader;

    @FindBy(xpath = "//*[@for='filter-dial_display-analog']")
    private WebElement dialFilterAnalog;

    @FindBy(xpath = "//*[text()='Lug Width']")
    private WebElement lugHeader;

    @FindBy(xpath = "//*[@data-testid='filter-tag-14']")
    private WebElement lugFilter14;

    @FindBy(xpath = "//*[@data-testid='filter-tag-22']")
    private WebElement lugFilter22;

    @FindBy(xpath = "//*[text()='Strap Material']")
    private WebElement strapHeader;

    @FindBy(xpath = "//*[@for='filter-strap_material-steel']")
    private WebElement strapFilterStainless;

    @FindBy(xpath = "//*[text()='Rating']")
    private WebElement ratingHeader;

    @FindBy(xpath = "//*[@for='filter-rating-4']")
    private WebElement ratingFilter4Plus;

    @FindBy(xpath = "//*[@data-testid='product-list-sort-button-best_selling']")
    private WebElement terlarisSort;

    @FindBy(xpath = "//*[@data-testid='sort-price-label']")
    private WebElement urutkanHeader;

    @FindBy(xpath = "//*[@aria-label='Sort Harga Tertinggi']")
    private WebElement tertinggiSort;

    @FindBy(xpath = "(//*[@class='product-card relative h-full'])[8]")
    private WebElement product8th;

    @FindBy(xpath = "(//*[@class='product-card relative h-full'])[6]")
    private WebElement product6th;

    @FindBy(xpath = "//button[@data-testid='pdp-btn-buy-now']")
    private WebElement buyNowButton;

    @FindBy(xpath = "//*[@data-testid='submit-add-to-cart']")
    private WebElement buyNowButtonPopUp;

    @FindBy(xpath = "//*[@data-testid='cart-btn-summary-cta']")
    private WebElement continueButton;

    public ItemPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterAnItem(String text) {
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(text);
    }

    public void clickBrandLogo() {
        wait.until(ExpectedConditions.visibilityOf(brandLogo));
        brandLogo.click();
    }

    public void clickPopularSearchBrand3rd() {
        wait.until(ExpectedConditions.visibilityOf(popularSearchBrand3rd));
        popularSearchBrand3rd.click();
    }

    public void clickKategoriFilterWanita() {
        wait.until(ExpectedConditions.visibilityOf(kategoriFilterWanita));
        kategoriFilterWanita.click();
    }

    public void clickKategoriFilterPria() {
        wait.until(ExpectedConditions.visibilityOf(kategoriFilterPria));
        kategoriFilterPria.click();
    }

    public void enterBrand(String text) {
        wait.until(ExpectedConditions.visibilityOf(brandField));
        brandField.sendKeys(text);

        wait.until(ExpectedConditions.visibilityOf(brandFilterSeiko));
        brandFilterSeiko.click();
    }

    public void clickHargaFilter1Sd5Jt() {
        wait.until(ExpectedConditions.visibilityOf(hargaFilter1Sd5Jt));
        hargaFilter1Sd5Jt.click();
    }

    public void clickStyleFilterDress() {
        wait.until(ExpectedConditions.visibilityOf(styleFilterDress));
        styleFilterDress.click();
    }

    public void clickStyleFilterSport() {
        wait.until(ExpectedConditions.visibilityOf(styleFilterSport));
        styleFilterSport.click();
    }

    public void clickMovementFilterQuartz() {
        wait.until(ExpectedConditions.visibilityOf(movementFilterQuartz));
        movementFilterQuartz.click();
    }

    public void clickMovementFilterAutomatic() {
        wait.until(ExpectedConditions.visibilityOf(movementFilterAutomatic));
        movementFilterAutomatic.click();
    }

    public void clickDiameterFilter28Sd30() {
//        wait.until(ExpectedConditions.visibilityOf(diameterHeader));
//        diameterHeader.click();

        wait.until(ExpectedConditions.visibilityOf(diameterFilter28Sd30));
        diameterFilter28Sd30.click();
    }

    public void clickDiameterFilter40Sd42() {
//        wait.until(ExpectedConditions.visibilityOf(diameterHeader));
//        diameterHeader.click();

        wait.until(ExpectedConditions.visibilityOf(diameterFilter40Sd42));
        diameterFilter40Sd42.click();
    }

    public void clickColorFilterSilver() {
        wait.until(ExpectedConditions.visibilityOf(colorHeader));
        colorHeader.click();

        wait.until(ExpectedConditions.visibilityOf(colorFilterSilver));
        colorFilterSilver.click();
    }

    public void clickColorFilterHitam() {
        wait.until(ExpectedConditions.visibilityOf(colorHeader));
        colorHeader.click();

        wait.until(ExpectedConditions.visibilityOf(colorFilterHitam));
        colorFilterHitam.click();
    }

    public void clickDialFilterAnalog() {
        wait.until(ExpectedConditions.visibilityOf(dialHeader));
        dialHeader.click();

        wait.until(ExpectedConditions.visibilityOf(dialFilterAnalog));
        dialFilterAnalog.click();
    }

    public void clickLugFilter14() {
        wait.until(ExpectedConditions.visibilityOf(lugHeader));
        lugHeader.click();

        wait.until(ExpectedConditions.visibilityOf(lugFilter14));
        lugFilter14.click();
    }

    public void clickLugFilter22() {
        wait.until(ExpectedConditions.visibilityOf(lugHeader));
        lugHeader.click();

        wait.until(ExpectedConditions.visibilityOf(lugFilter22));
        lugFilter22.click();
    }

    public void clickStrapFilterStainless() {
        wait.until(ExpectedConditions.visibilityOf(strapHeader));
        strapHeader.click();

        wait.until(ExpectedConditions.visibilityOf(strapFilterStainless));
        strapFilterStainless.click();
    }

    public void clickRatingFilter4Plus() {
        wait.until(ExpectedConditions.visibilityOf(ratingHeader));
        ratingHeader.click();

        wait.until(ExpectedConditions.visibilityOf(ratingFilter4Plus));
        ratingFilter4Plus.click();
    }

    public void clickTerlarisSort() {
        wait.until(ExpectedConditions.visibilityOf(terlarisSort));
        terlarisSort.click();
    }

    public void clickUrutkanTertinggiSort() {
        wait.until(ExpectedConditions.visibilityOf(urutkanHeader));
        urutkanHeader.click();

        wait.until(ExpectedConditions.visibilityOf(tertinggiSort));
        tertinggiSort.click();
    }

    public void clickProduct8th() {
        wait.until(ExpectedConditions.visibilityOf(product8th));
        product8th.click();
    }

    public void clickProduct6th() {
        wait.until(ExpectedConditions.visibilityOf(product6th));
        product6th.click();
    }

    public void clickBuyNowButton() {
        wait.until(ExpectedConditions.visibilityOf(buyNowButton));
        buyNowButton.click();
    }

    public void clickBuyNowButtonPopUp() {
        wait.until(ExpectedConditions.visibilityOf(buyNowButtonPopUp));
        buyNowButtonPopUp.click();
    }

    public void clickContinueButton() {
        wait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }
}