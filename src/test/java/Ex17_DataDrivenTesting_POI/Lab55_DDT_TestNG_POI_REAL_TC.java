package Ex17_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab55_DDT_TestNG_POI_REAL_TC {
    @Test(dataProvider = "getData")
    public void test_vwo_login(String email,String password)
    {
        System.out.println(email + " - "+ password);
    }

    @DataProvider
    public Object[][] getData()
    {
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("sheet1");
    }
}
