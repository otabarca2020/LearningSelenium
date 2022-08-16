package qalearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IframeTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,1000)");		
	    Thread.sleep(1000);
	    
	    
	    WebElement iframeElement = driver.findElement(By.id("courses-iframe"));
	    driver.switchTo().frame(iframeElement);
	    WebElement linkFrame = driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[3]/a"));
	    
	    linkFrame.click();
		
		      
	Thread.sleep(5000);


	driver.quit();
  }
}
