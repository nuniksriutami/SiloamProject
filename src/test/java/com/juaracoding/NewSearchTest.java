package com.juaracoding;

import com.juaracoding.Pages.LoginPage;
import com.juaracoding.Pages.NewPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NewSearchTest {


    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static NewPage newPage = new NewPage();
    public NewSearchTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

//    Given User berhasil masuk ke dalam new page
    @Given("User berhasil masuk ke dalam new page")
    public void user_masuk_ke_new_page(){
        newPage.clickNewMenu();
        extentTest.log(LogStatus.PASS, "User klik New Menu");
    }

    @When("User memasukkan data nama kandidat ke search field")
    public void user_masukkan_data_ke_search_field(){
        newPage.inputSearch("Itadori");
        extentTest.log(LogStatus.PASS, "User masukkan data");
    }



    @And("User klik search button")
    public void user_klik_search(){
        newPage.clickSearch();
        extentTest.log(LogStatus.PASS, "User klik search button");
    }

    @Then("Data nama kandidat berhasil ditampilkan")
    public void user_dapat_data_kandidat(){
        Assert.assertEquals(newPage.getNamaResult(10), "ITADORI");
        extentTest.log(LogStatus.PASS, "User berhasil mendapatkan data kandidat");
    }

    @When("User klik refresh button")
    public void user_klik_refresh(){
        newPage.clickRefresh();
        extentTest.log(LogStatus.PASS, "User klik refresh button");
    }

    @Then("Data kandidat berhasil direfresh")
    public void data_kandidat_direfresh(){
        Assert.assertNotEquals(newPage.getNamaResult(10),"ITADORI");
    }

    @When("User memasukkan data kota kandidat ke search field")
    public void user_masukkan_data_kota_ke_search_field(){
        newPage.inputSearch("KABUPATEN ACEH TIMUR");
        extentTest.log(LogStatus.PASS, "User masukkan data");
    }

    @Then("Data kota kandidat berhasil ditampilkan")
    public void user_dapat_data_kota_kandidat(){
        Assert.assertEquals(newPage.getKotaResult(10), "KABUPATEN ACEH TIMUR");
        extentTest.log(LogStatus.PASS, "User berhasil mendapatkan data kandidat");
    }

    @When("User memasukkan data asal kandidat ke search field")
    public void user_masukkan_data_asal_ke_search_field(){
        newPage.inputSearch("KABUPATEN ACEH TIMUR");
        extentTest.log(LogStatus.PASS, "jujutsu juga");
    }

    @Then("Data asal kandidat berhasil ditampilkan")
    public void user_dapat_data_asal_kandidat(){
        Assert.assertEquals(newPage.getAsalResult(10), "jujutsu juga");
        extentTest.log(LogStatus.PASS, "User berhasil mendapatkan data kandidat");
    }

    @When("User memasukkan data tujuan kandidat ke search field")
    public void user_masukkan_data_tujuan_ke_search_field(){
        newPage.inputSearch("Siloam Clinic Meikarta");
        extentTest.log(LogStatus.PASS, "jujutsu juga");
    }

    @Then("Data tujuan kandidat berhasil ditampilkan")
    public void user_dapat_data_tujuan_kandidat(){
        Assert.assertEquals(newPage.getTujuanResult(10), "Siloam Clinic Meikarta");
        extentTest.log(LogStatus.PASS, "User berhasil mendapatkan data kandidat");
    }


}
