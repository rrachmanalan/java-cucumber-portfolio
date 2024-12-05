package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;


public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @FindBy(xpath = "//*[@id='change-address-btn']")
    private WebElement gantiAlamatButton;

    @FindBy(xpath = "//*[text()='Tambah Alamat']")
    private WebElement tambahAlamatButton;

    @FindBy(xpath = "//*[@name='addressLabel']")
    private WebElement labelAlamatField;

    @FindBy(xpath = "//*[@for='set-primary-checkout']")
    private WebElement alamatUtamaBox;

    @FindBy(xpath = "//*[@name='recipientName']")
    private WebElement namaPenerimaField;

    @FindBy(xpath = "//*[@name='recipientPhone']")
    private WebElement noPenerimaField;

    @FindBy(xpath = "//*[text()='Provinsi, Kota, Kecamatan, Kode Pos*']")
    private WebElement areaField;

    @FindBy(xpath = "//*[@name='search-area']")
    private WebElement kotaField;

//    @FindBy(xpath = "//*[text()='Jawa Barat, Bogor, Jonggol']")
//    @FindBy(xpath = "//*[@data-testid='input-dropdown']/child::*/child::*")
//    @FindBy(xpath = "//*[@data-testid='input-dropdown']")
    @FindBy(xpath = "(//div[contains(text(),', ')])[3]")
    private WebElement kotaOption;

//    @FindBy(xpath = "//*[@aria-label='Postal code']")
//    private WebElement kodePosField;

    @FindBy(xpath = "//*[@name='addressDetail']")
    private WebElement detailAlamatField;

    @FindBy(xpath = "//*[@data-testid='confirm-form-address']")
    private WebElement simpanButton;

//    @FindBy(xpath = "//*[@aria-label='Set Primary Address']")
//    private WebElement jadikanUtamaButton;

//    @FindBy(xpath = "//*[@data-testid='confirm-set-primary-address']")
//    private WebElement pilihButton;

    @FindBy(xpath = "//*[text()='Pilih Pengiriman']")
    private WebElement shippingMethodButton;

    @FindBy(xpath = "//*[@data-testid='courier-list_jne-reg']")
    private WebElement shippingMethodOptionJneReg;

    @FindBy(xpath = "//*[@data-testid='courier-list_j-t-ez']")
    private WebElement shippingMethodOptionJntEz;

    @FindBy(xpath = "//*[text()='Pilih Pembayaran']")
    private WebElement choosePaymentButton;

    @FindBy(xpath = "//*[@data-testid='payment-method-parent-Transfer']")
    private WebElement bankTransferButton;

    @FindBy(xpath = "//*[@data-testid='payment-method-BANKTRANSFER-Mandiri']")
    private WebElement bankTransferOptionMandiri;

    @FindBy(xpath = "//*[@data-testid='payment-method-parent-VirtualAccount']")
    private WebElement virtualAccountButton;

    @FindBy(xpath = "//*[@data-testid='payment-method-VAPERMATA-Permata Virtual Account']")
    private WebElement virtualAccountOptionPermata;

    @FindBy(xpath = "//*[text()='Konfirmasi']")
    private WebElement konfirmasiPaymentButton;

    @FindBy(xpath = "(//*[text()='Total Pembayaran']/following-sibling::*/child::*)[1]")
    private static WebElement totalPriceValue;

    @FindBy(xpath = "//*[text()='Bayar Sekarang']")
    private WebElement orderNowButton;

    @FindBy(xpath = "//*[text()='Total Pembayaran']/following-sibling::*")
    private static WebElement totalPaymentValue;

    @FindBy(xpath = "//*[text()='Cek Pesanan Saya']")
    private WebElement checkOrderButton;

    @FindBy(xpath = "//button[text()='CEK PESANAN SAYA']")
    private WebElement checkOrderButtonVA;


    @FindBy(xpath = "(//*[text()='Total Pembayaran'])[1]/following-sibling::*")
    private WebElement totalPaymentOrderDetailsValue;


    @FindBy(xpath = "//*[@data-testid='status-unpaid']")
    private WebElement unpaidFilter;

    @FindBy(xpath = "(//*[@id='btn-order-detail'])[1]")
    private WebElement cekRincian1;

    @FindBy(xpath = "//*[@class='driver-next-btn']")
    private WebElement nextButton;

    @FindBy(xpath = "//*[text()='Total Pembayaran']/following-sibling::*")
    private static WebElement totalPaymentDetailsValue;

    @FindBy(xpath = "//*[text()='Batalkan Pesanan']")
    private WebElement batalkanPesananButton;

    @FindBy(xpath = "//*[@for='reason-changeVoucherCode']")
    private WebElement batalkanPesananOptionGantiVoucher;

    @FindBy(xpath = "//*[text()='Konfirmasi']")
    private WebElement konfirmasiButton;

    @FindBy(xpath = "//*[contains(text(), 'Pesanan dibatalkan')]")
    private WebElement pesananBatalLabel;

    public CheckoutPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickChangeAddressButton() {
        wait.until(ExpectedConditions.visibilityOf(gantiAlamatButton));
        gantiAlamatButton.click();
    }

    public void clickAddAddressButton() {
        wait.until(ExpectedConditions.visibilityOf(tambahAlamatButton));
        tambahAlamatButton.click();
    }

    public void enterAddressLabelField(String text) {
        wait.until(ExpectedConditions.visibilityOf(labelAlamatField));
//        labelAlamatField.clear();
        labelAlamatField.sendKeys(text);
    }

    public void clickSetPrimaryAddressBox() {
        wait.until(ExpectedConditions.visibilityOf(alamatUtamaBox));
        alamatUtamaBox.click();
    }

    public void enterRecipientNameField(String text) {
        wait.until(ExpectedConditions.visibilityOf(namaPenerimaField));
//        namaPenerimaField.clear();
        namaPenerimaField.sendKeys(text);
    }

    public void enterPhoneNumberField(String text) {
        wait.until(ExpectedConditions.visibilityOf(noPenerimaField));
        noPenerimaField.sendKeys(text);
    }

    public void enterCityField(String text) {
        wait.until(ExpectedConditions.visibilityOf(areaField));
        areaField.click();

        wait.until(ExpectedConditions.visibilityOf(kotaField));
        kotaField.sendKeys(text);

        wait.until(ExpectedConditions.visibilityOf(kotaOption));
//        wait.until(ExpectedConditions.elementToBeClickable(kotaOption));
        kotaOption.click();
    }

//    public void enterPostalCodeField(String text) {
//        wait.until(ExpectedConditions.visibilityOf(kodePosField));
//        kodePosField.sendKeys(text);
//    }

    public void enterAddressDetailsField(String text) {
        wait.until(ExpectedConditions.visibilityOf(detailAlamatField));
        detailAlamatField.sendKeys(text);
    }

    public void clickSaveAddressButton() {
        wait.until(ExpectedConditions.visibilityOf(simpanButton));
        simpanButton.click();
    }

//    public void clickSetAsMainAddressLabel() {
//        wait.until(ExpectedConditions.visibilityOf(jadikanUtamaButton));
//        jadikanUtamaButton.click();
//    }

//    public void clickChooseAsMainAddressButton() {
//        wait.until(ExpectedConditions.visibilityOf(pilihButton));
//        pilihButton.click();
//    }

    public void clickShippingMethodButton() {
        wait.until(ExpectedConditions.visibilityOf(shippingMethodButton));
        shippingMethodButton.click();
    }

    public void clickShippingMethodOptionJneReg() {
        wait.until(ExpectedConditions.visibilityOf(shippingMethodOptionJneReg));
        shippingMethodOptionJneReg.click();
    }

    public void clickShippingMethodOptionJntEz() {
        wait.until(ExpectedConditions.visibilityOf(shippingMethodOptionJntEz));
        shippingMethodOptionJntEz.click();
    }

    static HashMap<String, String> value = new HashMap<>();

    public static void putTotalPrice(){
        value.put("totalPrice",totalPriceValue.getText());
    }

    public static String getTotalPrice(){
        return value.get("totalPrice");
    }

    public void clickChoosePaymentButton() {
        wait.until(ExpectedConditions.visibilityOf(choosePaymentButton));
        choosePaymentButton.click();
    }

    public void clickBankTransferButton() {
        wait.until(ExpectedConditions.visibilityOf(bankTransferButton));
        bankTransferButton.click();
    }

    public void clickBankTransferOptionMandiri() {
        wait.until(ExpectedConditions.visibilityOf(bankTransferOptionMandiri));
        bankTransferOptionMandiri.click();
    }

    public void clickVirtualAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(virtualAccountButton));
        virtualAccountButton.click();
    }

    public void clickVirtualAccountOptionPermata() {
        wait.until(ExpectedConditions.visibilityOf(virtualAccountOptionPermata));
        virtualAccountOptionPermata.click();
    }

    public void clickKonfirmasiPaymentButton() {
        wait.until(ExpectedConditions.visibilityOf(konfirmasiPaymentButton));
        konfirmasiPaymentButton.click();
    }

    public void clickOrderNowButton() {
        wait.until(ExpectedConditions.visibilityOf(orderNowButton));
        orderNowButton.click();
    }

    public static void putTotalPayment(){
        value.put("totalPayment",totalPaymentValue.getText());
    }

    public static String getTotalPayment(){
        return value.get("totalPayment");
    }

    public void clickCheckOrderButton() {
        wait.until(ExpectedConditions.visibilityOf(checkOrderButton));
        checkOrderButton.click();
    }

    public void clickCheckOrderButtonVA() {
        wait.until(ExpectedConditions.visibilityOf(checkOrderButtonVA));
        checkOrderButtonVA.click();
    }

    public String getTotalPaymentOrderDetailsValue() {
        wait.until(ExpectedConditions.visibilityOf(totalPaymentOrderDetailsValue));
        return totalPaymentOrderDetailsValue.getText();
    }

    public void clickUnpaidFilter() {
        wait.until(ExpectedConditions.visibilityOf(unpaidFilter));
        unpaidFilter.click();
    }

    public void clickCekRincian1() {
        wait.until(ExpectedConditions.visibilityOf(cekRincian1));
        cekRincian1.click();
    }

    public void clickNextButton() {
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }


    public String getTotalPaymentDetailsValue() {
        wait.until(ExpectedConditions.visibilityOf(totalPaymentDetailsValue));
        return totalPaymentDetailsValue.getText();
    }

    public void clickBatalkanPesananButton() {
        wait.until(ExpectedConditions.visibilityOf(batalkanPesananButton));
        batalkanPesananButton.click();
    }

    public void clickBatalkanPesananOptionGantiVoucher() {
        wait.until(ExpectedConditions.visibilityOf(batalkanPesananOptionGantiVoucher));
        batalkanPesananOptionGantiVoucher.click();
    }

    public void clickKonfirmasiButton() {
        wait.until(ExpectedConditions.visibilityOf(konfirmasiButton));
        konfirmasiButton.click();
    }

    public boolean verifyPesananBatalIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(pesananBatalLabel));
        boolean a = pesananBatalLabel.isDisplayed();
        return a;
    }
}
