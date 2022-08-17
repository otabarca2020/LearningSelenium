package parametersTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningPropertiesTest {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  Properties property = new Properties();
	  FileInputStream filePath = new FileInputStream("C:\\Users\\OtnielLenovo\\eclipse-workspace\\LearningSelenium\\src\\test\\java\\parametersTestNG\\data.properties");
	  property.load(filePath);
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");   
	  driver = new ChromeDriver();
      driver.get(property.getProperty("url"));
      driver.manage().window().maximize();
      driver.quit();
  }
}
