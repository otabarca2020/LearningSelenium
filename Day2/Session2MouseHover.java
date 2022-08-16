package qalearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Session2MouseHover {
  @Test
  public void f() throws InterruptedException {
	  
//	  System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\chromeDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,400)");
		
	    Thread.sleep(1000);
	    WebElement ele = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		
		  //Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		      
	Thread.sleep(5000);


	driver.quit();
  }
}
