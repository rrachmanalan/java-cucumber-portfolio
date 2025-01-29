@jamtangan @login @regression
Feature: Transaction When Login

#@skena
#  Scenario: User is logged in
  Background: User is logged in
    Given the user opens jamtangan.com website
    When the user clicks the popups
    And the user clicks the 'Masuk' button
    And the user inserts a valid username and password
    And the user clicks the 'Masuk' popup button
    And the user is redirected to the home page

  @scenario1
  Scenario: Successfully checking out an item by searching a brand name and clicking its logo
    Given the user searches 'Seiko'
    When the user clicks the brand logo
    And the user clicks 'Wanita' option on 'Kategori' filter
    And the user clicks '1.000.000 - 5.000.000' option on 'Harga' filter
    And the user clicks 'Dress' option on 'Style' filter
    And the user clicks 'Quartz' option on 'Movement' filter
    And the user clicks '28-30 mm' option on 'Case Diameter' filter
    And the user clicks 'Silver' option on 'Warna' filter
    And the user clicks 'Analog' option on 'Dial Display' filter
    And the user clicks '14 mm' option on 'Lug Width' filter
    And the user clicks 'Stainless Steel' option on 'Strap Material' filter
    And the user clicks the eighth product
    And the user clicks the 'Beli Sekarang' button
    And the user clicks the 'Lanjutkan' button
    And the user clicks the 'Ganti Alamat' button
    And the user clicks the 'Tambah Alamat' button
    And the user inputs 'Test Alamat' in the 'Label Alamat' field
    And the user clicks the 'Jadikan alamat utama' checkbox
    And the user inputs 'Boboboy' in the 'Nama Penerima' field
    And the user inputs '081234567890' in the 'No. Handphone Penerima' field
    And the user inputs '16830' in the 'Kota atau Kecamatan' field
#    And the user inputs '87654' in the 'Kode Pos' field
    And the user inputs 'Jl. Kemangi 145' in the 'Detail Alamat' field
    And the user clicks the 'Simpan' button
#    And the user clicks the created address as the main address
#    And the user clicks the 'Pilih' button
    And the user clicks the 'Pilih Pengiriman' button
    And the user clicks the 'JNE REG' option
    And the user clicks the 'Pilih Pembayaran' button
    And the user clicks the 'Transfer Bank' button
    And the user clicks the 'Transfer Bank Mandiri' option
    And the user clicks the 'Konfirmasi' button on Payment Method
    And the user clicks the 'Bayar Sekarang' button
    And the user clicks the 'Cek Pesanan Saya' button
    Then the user compares the total payment in the 'Thank You' page with the one in the 'Pesanan Saya' page

  @scenario2
  Scenario: Successfully checking out an item by clicking a brand from popular searches and cancel it
    Given the user clicks the third most searched brand
    When the user clicks 'Pria' option on 'Kategori' filter
    And the user searches 'Seiko' on the 'Brands' search box
    And the user clicks '1.000.000 - 5.000.000' option on 'Harga' filter
    And the user clicks 'Sport' option on 'Style' filter
    And the user clicks 'Automatic' option on 'Movement' filter
    And the user clicks '40-42 mm' option on 'Case Diameter' filter
    And the user clicks 'Hitam' option on 'Warna' filter
    And the user clicks 'Analog' option on 'Dial Display' filter
    And the user clicks '22 mm' option on 'Lug Width' filter
    And the user clicks 'Stainless Steel' option on 'Strap Material' filter
    And the user clicks '4 ke atas' option on 'Rating' filter
    And the user clicks 'Terlaris' option on 'Product List' sorting
    And the user clicks 'Harga Tertinggi' option on 'Urutkan' sorting
    And the user clicks the sixth product
    And the user clicks the 'Beli Sekarang' button
#    And the user clicks the 'Beli Sekarang' button on the popup
    And the user clicks the 'Lanjutkan' button
    And the user clicks the 'Ganti Alamat' button
    And the user clicks the 'Tambah Alamat' button
    And the user inputs 'Rumah Eyang' in the 'Label Alamat' field
    And the user clicks the 'Jadikan alamat utama' checkbox
    And the user inputs 'Hamtaro' in the 'Nama Penerima' field
    And the user inputs '0858645731' in the 'No. Handphone Penerima' field
    And the user inputs '23768' in the 'Kota atau Kecamatan' field
#    And the user inputs '23768' in the 'Kode Pos' field
    And the user inputs 'Jl. Wortel Baru 73' in the 'Detail Alamat' field
    And the user clicks the 'Simpan' button
#    And the user clicks the created address as the main address
#    And the user clicks the 'Pilih' button
    And the user clicks the 'Pilih Pengiriman' button
    And the user clicks the 'J&T EZ' option
    And the user clicks the 'Pilih Pembayaran' button
    And the user clicks the 'Virtual Account' button
    And the user clicks the 'Permata Virtual Account' option
    And the user clicks the 'Konfirmasi' button on Payment Method
    And the user clicks the 'Bayar Sekarang' button
#    And the user clicks the 'CEK PESANAN SAYA' button
    And the user clicks the 'Cek Pesanan Saya' button
    And the user compares the total payment in the 'Thank You' page with the one in the 'Pesanan Saya' page
    And the user clicks the 'Belum Bayar' filter
    And the user clicks the first 'Cek Rincian' button
    And the user clicks the next button
    And the user compares the total payment in the 'Thank You' page with the one in the 'Rincian Pesanan' page
    And the user clicks the 'Batalkan Pesanan' button
    And the user clicks the 'Mau memasukkan mengubah vode voucher' option
    And the user clicks the 'Konfirmasi' button
    Then the user successfully cancels the order
