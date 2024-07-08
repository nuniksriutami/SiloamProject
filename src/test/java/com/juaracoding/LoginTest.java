package com.juaracoding;

import com.juaracoding.Pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {
    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User mengakses halaman login")
    public void user_mengakses_halaman_login(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User mengakses halaman login");
    }

    @When("User memasukan username yang valid")
    public void user_memasukan_username_yang_valid(){
        loginPage.inputUsername("K6400001");
        extentTest.log(LogStatus.PASS, "User memasukan username yang valid");
    }

    @And("User memasukan password yang valid")
    public void user_memasukan_password_yang_valid(){
        loginPage.inputPassword("a");
        extentTest.log(LogStatus.PASS, "User memasukan password yang valid");
    }

    @And("User klik tombol login")
    public void user_klik_tombol_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User klik tombol login");
    }

    @Then("User berhasil login dan diarahkan ke halaman utama")
    public void user_berhasil_login_dan_diarahkan_ke_halaman_utama(){
        Assert.assertEquals(loginPage.getTxtDasboard(10), "Home");
        extentTest.log(LogStatus.PASS, "User berhasil login dan diarahkan ke halaman utama");
    }

    @When("^User memasukan (.*) and (.*)$")
    public void masukan_credential_invalid(String username, String password){
        loginPage.login(username, password);
        extentTest.log(LogStatus.PASS, "User berhasil input username dan password");
    }

    @Then("User berada di login page")
    public void User_tetap_di_home_page(){
        Assert.assertEquals(loginPage.Login_Logo(3), "DIKA | SILOAM");
        extentTest.log(LogStatus.PASS, "User masih di home page");
    }

    @When("User klik tombol logout")
    public void user_logout(){
        loginPage.logout();
        Assert.assertEquals(loginPage.Login_Logo(3), "DIKA | SILOAM");
    }


}
