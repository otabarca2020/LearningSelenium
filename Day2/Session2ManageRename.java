package qalearning;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Session2ManageRename {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement openWindowButton = driver.findElement(By.id("openwindow"));		
		openWindowButton.click();	
		
//		driver.switchTo().defaultContent();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//  	
//	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")));
//
//		WebElement link = driver.findElement(By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a"));
//				 link.click();
		
		//String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    
		    System.out.println(driver.getTitle());
		}


	Thread.sleep(5000);


	driver.quit();
  }

}
