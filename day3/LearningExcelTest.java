package parametersTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningExcelTest {
  
	@Test(dataProvider="excelData")
	public void demoClass(String username, String password) throws InterruptedException {

		System.out.println(username);
		System.out.println(password);
	}
 
	@DataProvider(name = "excelData")
    public Object[][] excelDataProvider() throws IOException {
        // We are creating an object from the excel sheet data by calling a method that
        // reads data from the excel stored locally in our system
		 ReadExcelFile obj = new ReadExcelFile();
        Object[][] arrObj = obj.getExcelData(
                "C:\\Users\\OtnielLenovo\\eclipse-workspace\\LearningSelenium\\src\\test\\java\\parametersTestNG\\TestData.xlsx",
                "Login");
        return arrObj;
    }
}
