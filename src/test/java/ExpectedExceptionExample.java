import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionExample {

    @Test(expectedExceptions = AssertionError.class)
    public void testMethod() {
        System.out.println("About to throw an exception!");
        Assert.assertEquals("Gaurav", "Gaurav1");
    }
}