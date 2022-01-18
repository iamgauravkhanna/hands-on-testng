import com.opencsv.CSVReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataProviderCSVExample {

    @Test(description = "Test using Open CSV", dataProvider = "csvDataProvider")
    public void testMethodA(String var1, String var2, String var3) {
        System.out.println(var1 + " -- " + var2 + " -- " + var3);
    }

    @DataProvider(name = "csvDataProvider")
    public Object[][] provider() throws InterruptedException {
        return getDataFromCSV();
    }

    private Object[][] getDataFromCSV() {

        String csvFile = System.getProperty("user.dir") + "/src/test/java/sample.csv";

        List<String[]> list = new ArrayList<>();

        String[] line = null;

        Object[][] arrayToReturn = null;

        try {
            Reader reader = Files.newBufferedReader(Paths.get(csvFile));

            CSVReader csvReader = new CSVReader(reader);

            while ((line = csvReader.readNext()) != null) {
                list.add(line);
            }

            reader.close();
            csvReader.close();

            arrayToReturn = new Object[list.size()][list.size()];

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < list.size(); i++) {
            arrayToReturn[i] = list.get(i);
        }
        return arrayToReturn;
    }
}