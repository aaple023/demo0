package Bese;

import ExtendedReport.ExtendResult;
import Home.LoginPageAccount;

import negative.Forgot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static ExtendedReport.ExtendResult.extent;
import static ExtendedReport.ExtendResult.test;

public class SetUp {

    public static WebDriver driver;
    public static String name="neha";
    public static String password="rahulshettyacademy";
    @BeforeMethod
    public static void loginSetup() throws IOException {
        ExtendResult  roop=new ExtendResult();
        roop.config();

        test=extent.createTest("First run  on time");
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
         driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        extent.flush();

    }

    @Test
    public  static  void justLogin(){
        LoginPageAccount  account=new LoginPageAccount();
        account.loginCan(name,password);

    }
    @Test
    public static  void validatError() throws IOException {
        Forgot for1=new Forgot();
        for1.forgotLogin();

    }
    @AfterMethod
    public static  void  justClose(){
        driver.close();

    }
}
