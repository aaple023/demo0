package ExtendedReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Bese.SetUp.driver;


public class ExtendResult {

    public static ExtentTest test;
    public static ExtentReports extent=new ExtentReports();

    public static void config(){
        ExtentSparkReporter sparkReporter=new ExtentSparkReporter("target/Spark.html");
       // extent.attachReporter(sparkReporter); // extent.attachReporter(spark);
        sparkReporter.config().setDocumentTitle("NehaFirst_Automation_Title");
        sparkReporter.config().setReportName("NehaAutomation Engineer");
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Tester","neha Nishant Vats");


    }
    public static String capture() throws IOException {
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Dest=new File("src/../ExImages/"  +System.currentTimeMillis()  +".png");
        String errflpath=Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile,Dest);
        return errflpath;
    }
}
