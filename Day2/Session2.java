package qalearning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Session2 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	  
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    //jse.executeScript("window.scrollBy(0,-400)");
    
    jse.executeScript("document.getElementById('name').value='potato';");
    
    
    Thread.sleep(7000);
    
    
    driver.quit();
		
  }
}
