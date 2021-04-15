import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReportTest {
    public  WebDriver driver;
    @Test
    public void testReport() throws IOException {
           String currentdirectory=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",currentdirectory+"/src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://google.com");

        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(currentdirectory+"/report/extentreport.html");
        //extentSparkReporter.config().(false);
        ExtentReports extentReports=new ExtentReports();

        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Application","Demo");
        ExtentTest extentTest=extentReports.createTest("LoginTest");
        extentTest.log(Status.PASS,"passed 2", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
        //extentTest.addScreenCaptureFromPath(takeScreenshot());
        driver.close();
        extentReports.flush();



    }

    public String takeScreenshot() throws IOException {

        File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println();

        Files.move
                (Paths.get(screenshot.getAbsolutePath()),
                        Paths.get(System.getProperty("user.dir")+"/report/screenshot.png"));
        return  "screenshot.png";
    }
}
