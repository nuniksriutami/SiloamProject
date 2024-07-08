package com.juaracoding.Pages;

import com.juaracoding.Drivers.DriverSingleton;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InputPage {
    private WebDriver driver;
    private String strDelay = Constants.GLOB_PARAM_DELAY;
    public InputPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    // Locator
    @FindBy(xpath = "//span[normalize-space()='Input']")
    private WebElement menuInput;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement inputNama;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    private WebElement nomorBpjs;
    @FindBy(xpath = "//input[@id='no_ktp']")
    private WebElement nomorKtp;
    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement alamat;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    private WebElement kotaKtp;

    @FindBy(xpath = "//select[@id='ktp_city']")
    private WebElement selectKotaKTP;

    @FindBy(xpath = "//input[@role='textbox']")
    private WebElement txtBox;

    @FindBy(xpath = "//input[@id='origin_faskes']")
    private WebElement faskesAwal;
    @FindBy(xpath = "//select[@id='destination_faskes']")
    private WebElement selectFaskesTujuan;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    private WebElement faskesTujuan;

    @FindBy(xpath = "//textarea[@id='reason']")
    private WebElement alasan;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSimpan;

    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    private WebElement getTxtAlamat;

    @FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
    private WebElement getTxtBPJS;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    private WebElement getTxtAlasan;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement getTxtStatusCandidate;
    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    private WebElement getTxtStepUpload;
    public void clickBtnMenu(){
        Utils.delay(10, strDelay);
        menuInput.click();
        Utils.delay(10, strDelay);
    }
    public void inputFormNama(String nama){
        this.inputNama.sendKeys(nama);
        Utils.delay(1, strDelay);
    }
    public void inputNomorBpjs(String noBpjs){
        this.nomorBpjs.sendKeys(noBpjs);
        Utils.delay(1, strDelay);
    }
    public void inputNomorKtp(String noKtp){
        this.nomorKtp.sendKeys(noKtp);
        Utils.delay(1, strDelay);
    }
    public void inputAlamat(String alamatSales){
        this.alamat.sendKeys(alamatSales);
        Utils.delay(1, strDelay);
    }

    public void inputKotaKTP(String kotaKTP) {
        this.txtBox.sendKeys(kotaKTP);
        Utils.delay(1, strDelay);
    }

    public void clickKotaKtp() {
        this.kotaKtp.click();
        Utils.delay(1, strDelay);
    }

    public WebElement getKotaKTP() {
        return this.kotaKtp;
    }

    public WebElement getSelectKotaKTP() {
        return this.selectKotaKTP;
    }

    public void inputFaskesAwal(String faskesAwalSales){
        this.faskesAwal.sendKeys(faskesAwalSales);
        Utils.delay(1, strDelay);
    }

    public void selectFaskesTujuan(){
        this.selectFaskesTujuan.click();
    }

    public void inputFaskesTujuan(String faskesTujuan) {
        this.txtBox.sendKeys(faskesTujuan);
        Utils.delay(1, strDelay);
    }

    public void inputAlasan(String alasanSales){
        this.alasan.sendKeys(alasanSales);
        Utils.delay(1, strDelay);
    }

    public void clickBtnSave(){
        btnSimpan.click();
        Utils.delay(1, strDelay);
    }

    public String getTxtStatus(int delays){
        return getTxtStatusCandidate.getText();
    }

    public String getTxtNextStep(){
        return getTxtStepUpload.getText();
    }

    public String getTxtalasan(){
        return getTxtAlasan.getText();
    }

    public String getTxtalamat(){
        return getTxtAlamat.getText();
    }

    public String getTxtBpjs(){
        return getTxtBPJS.getText();
    }

    public void selectKotaKtp(String kotaKtp){
        Select select = new Select(selectKotaKTP);
        select.selectByVisibleText(kotaKtp);
        Utils.delay(1, strDelay);
    }

    public void selectFaskesTujuan(int faskesTujuan){
        Select select = new Select(selectFaskesTujuan);
        select.selectByIndex(faskesTujuan);
        Utils.delay(1, strDelay);
    }

    public void inputData(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
        Robot robot = new Robot();

        clearNama();
        inputFormNama(nama);

        clearNomorBpjs();
        inputNomorBpjs(nomBpjs);

        clearNomorKtp();
        inputNomorKtp(nomKtp);

        clearAlamat();
        inputAlamat(address);

        clickKotaKtp();
        inputKotaKTP(kotaKTP);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        clearFaskesAwal();
        inputFaskesAwal(faskesAwal);

        clickFaskesTujuan();
        inputFaskesTujuan(faskesTujuan);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        if(!faskesTujuan.equalsIgnoreCase("faskes")) {
            clearAlasan();
            inputAlasan(alasan);
        }
    }

    public void clearNama() {
        this.inputNama.clear();
        Utils.delay(1, strDelay);
    }

    public void clearNomorBpjs() {
        this.nomorBpjs.clear();
        Utils.delay(1, strDelay);
    }

    public void clearNomorKtp() {
        this.nomorKtp.clear();
        Utils.delay(1, strDelay);
    }

    public void clearAlamat() {
        this.alamat.clear();
        Utils.delay(1, strDelay);
    }

    public void clearAlasan() {
        this.alasan.clear();
        Utils.delay(1, strDelay);
    }

    public void clearFaskesAwal() {
        this.faskesAwal.clear();
        Utils.delay(1, strDelay);
    }

    public void clickFaskesTujuan() {
        this.faskesTujuan.click();
    }
}
