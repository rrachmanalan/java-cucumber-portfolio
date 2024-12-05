package steps;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.checkout.CheckoutPage;

import java.io.IOException;

import static hooks.Hooks.props;
import static hooks.Hooks.wait;

public class CheckoutSteps {
    private WebDriver driver;
    private CheckoutPage checkoutPage;

    public CheckoutSteps() throws IOException {
        this.driver= Hooks.driver;
        this.checkoutPage = new CheckoutPage(driver, wait);
    }

    @And("the user clicks the 'Ganti Alamat' button")
    public void theUserClicksChangeAddressButton() {
        checkoutPage.clickChangeAddressButton();
    }

    @And("the user clicks the 'Tambah Alamat' button")
    public void theUserClicksAddAddressButton() {
        checkoutPage.clickAddAddressButton();
    }

    @And("the user inputs {string} in the 'Label Alamat' field")
    public void theUserEntersAddressLabelField(String addressLabel) {
        checkoutPage.enterAddressLabelField(addressLabel);
    }

    @And("the user clicks the 'Jadikan alamat utama' checkbox")
    public void theUserSetsPrimaryAddressBox() {
        checkoutPage.clickSetPrimaryAddressBox();
    }

    @And("the user inputs {string} in the 'Nama Penerima' field")
    public void theUserEntersRecipientNameField(String recipientName) {
        checkoutPage.enterRecipientNameField(recipientName);
    }

    @And("the user inputs {string} in the 'No. Handphone Penerima' field")
    public void theUserEntersPhoneNumberField(String phoneNumber) {
        checkoutPage.enterPhoneNumberField(phoneNumber);
    }

    @And("the user inputs {string} in the 'Kota atau Kecamatan' field")
    public void theUserEntersCityField(String city) {
        checkoutPage.enterCityField(city);
    }

//    @And("the user inputs {string} in the 'Kode Pos' field")
//    public void theUserEntersPostalCodeField(String postalCode) {
//        checkoutPage.enterPostalCodeField(postalCode);
//    }

    @And("the user inputs {string} in the 'Detail Alamat' field")
    public void theUserEntersAddressDetailsField(String addressDetails) {
        checkoutPage.enterAddressDetailsField(addressDetails);
    }

    @And("the user clicks the 'Simpan' button")
    public void theUserClicksSaveAddressButton() {
        checkoutPage.clickSaveAddressButton();
    }

//    @And("the user clicks the created address as the main address")
//    public void theUserClicksSetAsMainAddressLabel() {
//        checkoutPage.clickSetAsMainAddressLabel();
//    }

//    @And("the user clicks the 'Pilih' button")
//    public void theUserClicksChooseAsMainAddressButton() {
//        checkoutPage.clickChooseAsMainAddressButton();
//    }

    @And("the user clicks the 'Pilih Pengiriman' button")
    public void theUserClicksShippingMethodButton() {
        checkoutPage.clickShippingMethodButton();
    }

    @And("the user clicks the 'JNE REG' option")
    public void theUserClicksShippingMethodOptionJneReg() {
        checkoutPage.clickShippingMethodOptionJneReg();
    }

    @And("the user clicks the 'J&T EZ' option")
    public void theUserClicksShippingMethodOptionJntEz() {
        checkoutPage.clickShippingMethodOptionJntEz();
    }

    @And("the user clicks the 'Pilih Pembayaran' button")
    public void theUserClicksChoosePaymentButton() throws InterruptedException {
        Thread.sleep(5000);
        CheckoutPage.putTotalPrice();
        System.out.println("Total Price is: " + CheckoutPage.getTotalPrice());
        checkoutPage.clickChoosePaymentButton();
    }

    @And("the user clicks the 'Transfer Bank' button")
    public void theUserClicksTransferButton() {
        checkoutPage.clickBankTransferButton();
    }

    @And("the user clicks the 'Transfer Bank Mandiri' option")
    public void theUserClicksTransferOptionMandiri() {
        checkoutPage.clickBankTransferOptionMandiri();
    }

    @And("the user clicks the 'Virtual Account' button")
    public void theUserClicksVirtualAccountButton() {
        checkoutPage.clickVirtualAccountButton();
    }

    @And("the user clicks the 'Permata Virtual Account' option")
    public void theUserClicksVirtualAccountOptionPermata() {
        checkoutPage.clickVirtualAccountOptionPermata();
    }

    @And("the user clicks the 'Konfirmasi' button on Payment Method")
    public void theUserClicksKonfirmasiPaymentButton() {
        checkoutPage.clickKonfirmasiPaymentButton();
    }

    @And("the user clicks the 'Bayar Sekarang' button")
    public void theUserClicksOrderNowButton() {
        checkoutPage.clickOrderNowButton();
    }

    @And("the user clicks the 'Cek Pesanan Saya' button")
    public void theUserClicksCheckOrderButton() throws InterruptedException {
        Thread.sleep(5000);
        CheckoutPage.putTotalPayment();
        System.out.println("Total Payment is: " + CheckoutPage.getTotalPayment());
        checkoutPage.clickCheckOrderButton();
    }

    @And("the user clicks the 'CEK PESANAN SAYA' button")
    public void theUserClicksCheckOrderButtonVA() throws InterruptedException {
        Thread.sleep(5000);
        CheckoutPage.putTotalPayment();
        System.out.println("Total Payment is: " + CheckoutPage.getTotalPayment());
        checkoutPage.clickCheckOrderButtonVA();
    }

    @Then("the user compares the total payment in the 'Thank You' page with the one in the 'Pesanan Saya' page")
    public void theUserComparesTotalPayments() {
        Assert.assertEquals(CheckoutPage.getTotalPayment(), checkoutPage.getTotalPaymentOrderDetailsValue());
        System.out.println("Total Payment in the 'Order Details' page is: " + checkoutPage.getTotalPaymentOrderDetailsValue());
    }

    @And("the user clicks the 'Belum Bayar' filter")
    public void theUserClicksUnpaidFilter() {
        checkoutPage.clickUnpaidFilter();
    }

    @And("the user clicks the first 'Cek Rincian' button")
    public void theUserClicksCekRincian1() {
        checkoutPage.clickCekRincian1();
    }

    @And("the user clicks the next button")
    public void theUserClicksNextButton() {
        checkoutPage.clickNextButton();
    }


    @And("the user compares the total payment in the 'Thank You' page with the one in the 'Rincian Pesanan' page")
    public void theUserComparesTotalPayments2() {
        Assert.assertEquals(CheckoutPage.getTotalPayment(), checkoutPage.getTotalPaymentDetailsValue());
        System.out.println("Total Payment in the 'Rincian Pesanan' page is: " + checkoutPage.getTotalPaymentDetailsValue());
    }

    @And("the user clicks the 'Batalkan Pesanan' button")
    public void theUserClicksBatalkanPesananButton() {
        checkoutPage.clickBatalkanPesananButton();
    }

    @And("the user clicks the 'Mau memasukkan mengubah vode voucher' option")
    public void theUserClicksBatalkanPesananOptionGantiVoucher() {
        checkoutPage.clickBatalkanPesananOptionGantiVoucher();
    }

    @And("the user clicks the 'Konfirmasi' button")
    public void theUserClicksKonfirmasiButton() {
        checkoutPage.clickKonfirmasiButton();
    }

    @Then("the user successfully cancels the order")
    public void theUserSuccessfullyCancelsTheOrder() {
        Assert.assertTrue(checkoutPage.verifyPesananBatalIsDisplayed());
    }
}
