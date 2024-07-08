package com.juaracoding.Pages;

import com.juaracoding.Drivers.DriverSingleton;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private String strDelay = Constants.GLOB_PARAM_DELAY;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private  WebElement btnLogin;
    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement txtDashboard;

    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    private WebElement loginLogo;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    private WebElement userLogoBtn;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement logoutBtn;

    // bisa digunakan precondition
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
        Utils.delay(3, strDelay);
    }

    public void logout(){
        this.userLogoBtn.click();
        Utils.delay(3, strDelay);
        this.logoutBtn.click();
        Utils.delay(3, strDelay);
    }
    public void inputUsername(String username){
        this.username.sendKeys(username);
        Utils.delay(1, strDelay);
    }

    public void inputPassword(String password){
        this.password.sendKeys(password);
        Utils.delay(1, strDelay);
    }

    public String Login_Logo(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(loginLogo)).getText();
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    // return getText
    public String getTxtDasboard(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(txtDashboard)).getText();
    }

}
