package qalearning;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
public class ScreenshotTest {

	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
	      System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");   
		  driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.manage().window().maximize();
	  }	
	  
	  
	  
	  
	  
	  
	  @Test
	  public void ScreenshotDemo() throws InterruptedException, IOException {
		  WebElement inputName = driver.findElement(By.name("enter-name"));
		  inputName.sendKeys("otniel");
//		  Thread.sleep(5000);	
		  
	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File("./Screenshots/Screenshot3.jpg");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	  }
	  
	  @Test
	  public void ScreenshotDemo2() throws InterruptedException, IOException {
		  WebElement inputName = driver.findElement(By.name("enter-name"));
		  inputName.sendKeys("otniel");
//		  Thread.sleep(5000);	
		  
	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile= inputName.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File("./Screenshots/Screenshot2.jpg");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	  }
}
