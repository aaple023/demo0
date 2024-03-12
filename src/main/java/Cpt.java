
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class Cpt {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("chromedriver.chrome.driver","/usr/local/bin/chromedriver");
        ChromeDriver driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://rahulshettyacademy.com/angularAppdemo/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));


    }
}


