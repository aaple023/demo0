package Home;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Bese.SetUp.driver;

public class LoginPageAccount {

    public static String login_user_id="inputUsername";
    public  static  String  login_password_xpath="//*[@name='inputPassword']";
    public  static  String submit_click_css=".submit.signInBtn";
    //rahulshettyacademy
    public  static  void  loginCan(String name,String password){
        driver.findElement(By.id(login_user_id)).sendKeys(name);
        driver.findElement(By.xpath(login_password_xpath)).sendKeys(password);
        driver.findElement(By.cssSelector(submit_click_css)).click();
      String g=  driver.findElement(By.xpath("//div[1] //p")).getAttribute("style");
      System.out.println(g);
      Assert.assertTrue(true);





    }
}
