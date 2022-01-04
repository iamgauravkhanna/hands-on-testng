import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerImpl.class)
public class CatchingExceptionExample {

    @Test
    public void TestForCatchException(){
        try {
            Assert.assertEquals("Gaurav", "Gaurav1");
        }
        catch (AssertionError e) {
            e.printStackTrace();
        }
    }
}
