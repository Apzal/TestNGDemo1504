import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

public class ReportingFeature {

    @Test
    public void AddReport(){
        String currentdirectory=System.getProperty("user.dir");
        String filepath=currentdirectory+"/report/extentreport.html";
        //ExtentSparkReporter Create instance
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(filepath);

        //ExtentReports Create instance and attach report
        ExtentReports extentReports=new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("Application","Demo");
        extentReports.setSystemInfo("Browser","Chrome");

        //ExtentTest -Create Test and add logs
        ExtentTest extentTest=extentReports.createTest("Reporting1");

        extentTest.log(Status.FAIL,"This step failed");
        extentTest.fail("failing this");

        //ExtentTest -Create Test and add logs
        extentTest=extentReports.createTest("Reporting2");
        extentTest.log(Status.PASS,"This step passed");
        extentTest.pass("pass this");

        //ExtentTest -Create Test and add logs
        extentTest=extentReports.createTest("Reporting3");
        extentTest.log(Status.SKIP,"This step skipped");
        extentTest.skip("skip this");





        //flush the report
        extentReports.flush();




    }
}
