package steps;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.item.ItemPage;

import java.io.IOException;

import static hooks.Hooks.wait;

public class ItemSteps {
    private WebDriver driver;
    private ItemPage itemPage;

    public ItemSteps() throws IOException {
        this.driver= Hooks.driver;
        this.itemPage = new ItemPage(driver, wait);
    }

    @Given("the user searches {string}")
    public void theUserSearchesAnItem(String item) {
        itemPage.enterAnItem(item);
    }

    @When("the user clicks the brand logo")
    public void theUserClicksTheBrandLogo() {
        itemPage.clickBrandLogo();
    }

    @Given("the user clicks the third most searched brand")
    public void theUserClicksPopularSearchBrand3rd() {
        itemPage.clickPopularSearchBrand3rd();
    }

    @And("the user clicks 'Wanita' option on 'Kategori' filter")
    public void theUserClicksKategoriFilterWanita() {
        itemPage.clickKategoriFilterWanita();
    }

    @When("the user clicks 'Pria' option on 'Kategori' filter")
    public void theUserClicksKategoriFilterPria() {
        itemPage.clickKategoriFilterPria();
    }

    @And("the user searches {string} on the 'Brands' search box")
    public void theUserSearchesBrandSearchBox(String brand) {
        itemPage.enterBrand(brand);
    }

    @And("the user clicks '1.000.000 - 5.000.000' option on 'Harga' filter")
    public void theUserClicksHargaFilter1Sd5Jt() {
        itemPage.clickHargaFilter1Sd5Jt();
    }

    @And("the user clicks 'Dress' option on 'Style' filter")
    public void theUserClicksStyleFilterDress() {
        itemPage.clickStyleFilterDress();
    }

    @And("the user clicks 'Sport' option on 'Style' filter")
    public void theUserClicksStyleFilterSport() {
        itemPage.clickStyleFilterSport();
    }

    @And("the user clicks 'Quartz' option on 'Movement' filter")
    public void theUserClicksMovementFilterQuartz() {
        itemPage.clickMovementFilterQuartz();
    }

    @And("the user clicks 'Automatic' option on 'Movement' filter")
    public void theUserClicksMovementFilterAutomatic() {
        itemPage.clickMovementFilterAutomatic();
    }

    @And("the user clicks '28-30 mm' option on 'Case Diameter' filter")
    public void theUserClicksMovementdiameterFilter28Sd30() {
        itemPage.clickDiameterFilter28Sd30();
    }

    @And("the user clicks '40-42 mm' option on 'Case Diameter' filter")
    public void theUserClicksMovementdiameterFilter40Sd42() {
        itemPage.clickDiameterFilter40Sd42();
    }

    @And("the user clicks 'Silver' option on 'Warna' filter")
    public void theUserClicksColorFilterSilver() {
        itemPage.clickColorFilterSilver();
    }

    @And("the user clicks 'Hitam' option on 'Warna' filter")
    public void theUserClicksColorFilterHitam() {
        itemPage.clickColorFilterHitam();
    }

    @And("the user clicks 'Analog' option on 'Dial Display' filter")
    public void theUserClicksDialFilterAnalog() {
        itemPage.clickDialFilterAnalog();
    }

    @And("the user clicks '14 mm' option on 'Lug Width' filter")
    public void theUserClicksLugFilter14() {
        itemPage.clickLugFilter14();
    }

    @And("the user clicks '22 mm' option on 'Lug Width' filter")
    public void theUserClicksLugFilter22() {
        itemPage.clickLugFilter22();
    }

    @And("the user clicks 'Stainless Steel' option on 'Strap Material' filter")
    public void theUserClicksStrapFilterStainless() {
        itemPage.clickStrapFilterStainless();
    }

    @And("the user clicks '4 ke atas' option on 'Rating' filter")
    public void theUserClicksRatingFilter4Plus() {
        itemPage.clickRatingFilter4Plus();
    }

    @And("the user clicks 'Terlaris' option on 'Product List' sorting")
    public void theUserClicksTerlarisSort() {
        itemPage.clickTerlarisSort();
    }

    @And("the user clicks 'Harga Tertinggi' option on 'Urutkan' sorting")
    public void theUserClicksUrutkanTertinggiSort() {
        itemPage.clickUrutkanTertinggiSort();
    }

    @And("the user clicks the eighth product")
    public void theUserClicksProduct8th() {
        itemPage.clickProduct8th();
    }

    @And("the user clicks the sixth product")
    public void theUserClicksProduct6th() {
        itemPage.clickProduct6th();
    }

    @And("the user clicks the 'Beli Sekarang' button")
    public void theUserClicksBuyNowButton() {
        itemPage.clickBuyNowButton();
    }

    @And("the user clicks the 'Beli Sekarang' button on the popup")
    public void theUserClicksBuyNowButtonPopUp() {
        itemPage.clickBuyNowButtonPopUp();
    }

    @And("the user clicks the 'Lanjutkan' button")
    public void theUserClicksContinueButton() {
        itemPage.clickContinueButton();
    }
}