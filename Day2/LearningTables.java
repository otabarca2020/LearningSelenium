package qalearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningTables {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		WebElement tableElement = driver.findElement(By.xpath("//table/tbody"));	
		
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		
		for(int i=0; i< rows.size(); i++) {
			
		System.out.println(rows.get(i).findElement(By.xpath("td[1]")).getText());
					
		}
		WebElement lastButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div[2]/ul/li[7]/a"));
		
		lastButton.click();
		
		for(WebElement column : rows) {
			System.out.println("Using Foreach");
			System.out.println(column.findElement(By.xpath("td[1]")).getText());
		}
		
		



	Thread.sleep(5000);


	driver.quit();

  }
}
