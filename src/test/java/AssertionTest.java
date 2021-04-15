import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    @Test
    public void TestAssertions1(){
        //Assert.assertEquals("goo.gle.com","google.com");
        //fail

        SoftAssert softAssert=new SoftAssert();
        //failure
        softAssert.assertTrue(true,"failure 1");


        //failure
       // softAssert.assertTrue(false,"failure 2");

        softAssert.assertAll();
        System.out.println("will this be executed??Yes");






    }


    @Test
    public void TestAssertions2(){
        //Assert.assertEquals("goo.gle.com","google.com");
        //pass
        System.out.println("in test2");
        Assert.assertTrue(true,"condition not matching");
        //if above statement fails
        System.out.println("will this be executed??No");
    }
}
