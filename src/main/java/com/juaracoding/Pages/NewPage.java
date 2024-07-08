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

public class NewPage {


    private WebDriver driver;
    private String strDelay = Constants.GLOB_PARAM_DELAY;
    public NewPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/new_data']")
    private WebElement newBtn;

    @FindBy(xpath = "//input[@id='tgl']")
    private WebElement startDate;

    @FindBy(xpath = "//input[@id='tgl2']")
    private WebElement endDate;

    @FindBy(xpath = "//button[@id='btn-filter']")
    private WebElement filterBtn; //done

    @FindBy(xpath = "//button[@id='btn-reset']")
    private WebElement resetBtn; //done

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField; //done

    @FindBy(xpath = "//span[@id='btnSearch']/i")
    private WebElement searchBtn; //done

    @FindBy(xpath = "//span[@id='btnRefresh']/i")
    private WebElement refreshBtn; //done

    @FindBy(xpath = "//table[@id='table']/tbody/tr/td[7]/center/a/span")
    private WebElement aksiBtn; //done

    @FindBy(xpath = "//li[@id='table_previous']/a")
    private WebElement preBtn; //done

    @FindBy(xpath = "//li[@id='table_next']/a")
    private WebElement nextBtn; //done

    @FindBy(xpath = "//div[@id='table_paginate']/ul/li[2]/a")
    private WebElement page1Btn; //done

    @FindBy(xpath = "//div[@id='table_paginate']/ul/li[3]/a")
    private WebElement page2Btn; //done

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement showMenu;

    @FindBy(xpath = "//table[@id='table']/tbody/tr/td[2]")
    private WebElement namaResult;

    @FindBy(xpath = "//table[@id='table']/tbody/tr/td[3]")
    private WebElement nomorResult;

    @FindBy(xpath = "//table[@id='table']/tbody/tr/td[4]")
    private WebElement kotaResult;

    @FindBy(xpath = "//table[@id='table']/tbody/tr/td[5]")
    private WebElement asalResult;

    @FindBy(xpath = "//table[@id='table']/tbody/tr/td[6]")
    private WebElement tujuanResult;

//    @FindBy(xpath = "")

    public void clickNewMenu(){
        newBtn.click();
        Utils.delay(1, strDelay);
    }

    public void clickFilter(){
        filterBtn.click();
        Utils.delay(1, strDelay);
    }

    public void clickReset(){
        resetBtn.click();
        Utils.delay(1, strDelay);
    }

    public void inputSearch(String data){
        this.searchField.sendKeys(data);
        Utils.delay(1, strDelay);
    }

    public void clickSearch(){
       searchBtn.click();
        Utils.delay(1, strDelay);
    }

    public void clickRefresh(){
        refreshBtn.click();
        Utils.delay(1, strDelay);
    }

    public void clickPrevious(){
        preBtn.click();
        Utils.delay(1, strDelay);
    }

    public void clickNext(){
        nextBtn.click();
        Utils.delay(1, strDelay);
    }

    public void clickAksi(){
        aksiBtn.click();
    }

    public void clickPage1(){
        page1Btn.click();
    }

    public void clickPage2(){
        page2Btn.click();
    }

    public String getNamaResult(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(namaResult)).getText();
    }

    public String getNomorResult(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(nomorResult)).getText();
    }

    public String getKotaResult(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(kotaResult)).getText();
    }

    public String getAsalResult(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(asalResult)).getText();
    }

    public String getTujuanResult(int delays){
        return new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(tujuanResult)).getText();
    }


}
