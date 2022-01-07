import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependencyTestsExample {

    @DataProvider(name = "test-data")
    public Object[] dataProviderMethod() {
        return new Object[]{"Alpha","Beta"};
    }

    @Test(dataProvider = "test-data")
    public void testMethodA(String value) {
        System.out.println("=== In testMethodA ===");
        System.out.println(value);
    }

    @Test(dependsOnMethods = "testMethodA")
    public void testMethodB() {
        System.out.println("=== In testMethodB ===");
    }
}