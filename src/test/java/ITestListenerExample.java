import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerImpl.class)
public class ITestListenerExample {

    @Test
    public void TestForCatchException() {
        Assert.assertEquals("Gaurav", "Gaurav1");
    }
}
