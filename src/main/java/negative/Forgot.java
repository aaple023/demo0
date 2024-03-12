package negative;

import com.aventstack.extentreports.ExtentTest;


import org.openqa.selenium.By;



import java.io.IOException;

import static Bese.SetUp.driver;

import static Bese.SetUp.name;


import static Home.LoginPageAccount.*;



public class Forgot {
    public static String password1 = "kjsdfb";

    public static void forgotLogin() throws IOException {
        driver.findElement(By.id(login_user_id)).sendKeys(name);
        driver.findElement(By.xpath(login_password_xpath)).sendKeys(password1);
        driver.findElement(By.cssSelector(submit_click_css)).click();
        String expectedTitleSN="* Incorrect username or password";
      /*  String actualTitleSN=driver.findElement(By.xpath("(//p[@class='error'])[1]")).getText();
        if (expectedTitleSN.equals( actualTitleSN )){
            test.log(Status.PASS, "Test passed for title  verification of sport shoes");
            test.log(Status.PASS,test.addScreenCaptureFromPath(capture())+"Teat passed");
        }

        else{
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
            ExtentTest testIsFailed = test.log(Status.FAIL,"Test is failed");
            Assert.assertTrue(true);
        }*/


    }
}
