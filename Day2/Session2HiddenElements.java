package qalearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Session2HiddenElements {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));		
		showButton.click();		
		WebElement inputDisplay =driver.findElement(By.id("show-textbox"));
		Assert.isTrue(inputDisplay.isDisplayed(), "Element is hidden");
		Thread.sleep(1000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));		
		hideButton.click();		
		Assert.isTrue(inputDisplay.isEnabled(), "Element is displayed");
  
  
  
  Thread.sleep(7000);
  
  
  driver.quit();
  }
}
