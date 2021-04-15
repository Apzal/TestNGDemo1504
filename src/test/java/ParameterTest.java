import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"browser","url"})
    public void testParameter1(String browser,String link){
        System.out.println("Browser->"+browser);
        System.out.println("Url->"+link);
    }

    @Test
    @Parameters({"browser","url"})
    public void testParameter2(String browser,String link){
        System.out.println("Browser->"+browser);
        System.out.println("Url->"+link);
    }
}
