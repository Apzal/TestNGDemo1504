import org.testng.annotations.DataProvider;

public class DataSupply {

    @DataProvider(name = "logindata")
    public Object[][] LoginData(){
        //write code to retrieve data from excel -Apache POI

        return new Object[][] {
                {"un1","password1"},
                {"un2","password2"}
        };

        //String[] data={"un1","password1"};

    }
}
