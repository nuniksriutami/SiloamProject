package com.juaracoding;

import com.juaracoding.Pages.InputPage;
import com.juaracoding.Pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;

public class InputTest {
    private static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();
    public static InputPage inputPage = new InputPage();
    public InputTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Admin masuk ke menu Input")
    public void masuk_ke_menu_input(){
        inputPage.clickBtnMenu();
        extentTest.log(LogStatus.PASS, "User berhasil Masuk Menu Input");
    }

    @And("^Admin Melakukan Update Pada (.*?), (.*?), (.*?), (.*?), (.*?), (.*?), (.*?) dan (.*?)$")
    public void update_form(String nama, String nomBpjs,String nomKtp, String address, String kotaKTP, String faskesAwal, String faskesTujuan, String alasan) throws AWTException {
        inputPage.inputData(nama, nomBpjs, nomKtp, address, kotaKTP, faskesAwal, faskesTujuan, alasan);
        extentTest.log(LogStatus.PASS, "User berhasil Melakukan Update");
    }

    @And("Admin tekan tombol Simpan")
    public void click_simpan(){
        inputPage.clickBtnSave();
        extentTest.log(LogStatus.PASS, "User berhasil simpan form");
    }

    @Then("Data kandidat ditambahkan ke sistem dengan informasi yang sesuai")
    public void data_kandidat_ditambahkan(){
        Assert.assertEquals(inputPage.getTxtStatus(1), "8684354687765");
        extentTest.log(LogStatus.PASS, "User berhasil ke halaman selanjutnya");
    }


}
