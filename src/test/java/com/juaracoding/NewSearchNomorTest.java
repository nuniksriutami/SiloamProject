package com.juaracoding;

import com.juaracoding.Pages.NewPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewSearchNomorTest {

    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static NewPage newPage = new NewPage();
    public NewSearchNomorTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User berhasil masuk ke dalam new page2")
    public void user_masuk_ke_new_page(){
        newPage.clickNewMenu();
        extentTest.log(LogStatus.PASS, "User klik New Menu");
    }

    @When("User memasukkan data nomor kandidat ke search field")
    public void user_masukkan_data_ke_search_field(){
        newPage.inputSearch("8684354687765");
        extentTest.log(LogStatus.PASS, "User masukkan data");
    }



    @And("User klik search button2")
    public void user_klik_search(){
        newPage.clickSearch();
        extentTest.log(LogStatus.PASS, "User klik search button");
    }

    @Then("Data nomor kandidat berhasil ditampilkan")
    public void user_dapat_data_kandidat(){
        Assert.assertEquals(newPage.getNomorResult(10), "8684354687765");
        extentTest.log(LogStatus.PASS, "User berhasil mendapatkan data kandidat");
    }

    @When("User klik refresh button2")
    public void user_klik_refresh(){
        newPage.clickRefresh();
        extentTest.log(LogStatus.PASS, "User klik refresh button");
    }

    @Then("Data kandidat berhasil direfresh2")
    public void data_kandidat_direfresh(){
        Assert.assertNotEquals(newPage.getNamaResult(10),"ITADORI");
    }


}
