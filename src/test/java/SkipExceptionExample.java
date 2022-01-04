import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExceptionExample {

    @Test
    public void TestA() {
        System.out.println("I will run");
    }

    @Test
    public void TestB() {
        throw new org.testng.SkipException("Skipping this exception");
    }
}
