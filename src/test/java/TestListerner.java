import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerner implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("failure-takescreenshot");
    }

    public void onTestSuccess (ITestResult result) {
        System.out.println("pass-takescreenshot");
    }

}
