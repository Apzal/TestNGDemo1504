import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "logindata",dataProviderClass = DataSupply.class)
    public void Login(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }




}
