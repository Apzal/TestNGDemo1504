import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenerTest {
    @Test
    public void failTest(){
        Assert.fail();
    }
}
