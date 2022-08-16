package qalearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningTables2 {
	
	 @Test
	  public void learningArrays() throws InterruptedException {
		  
		  
		  String url = "https://rahulshettyacademy.com/seleniumPractise";
	      System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");   
		  WebDriver driver = new ChromeDriver();
	      driver.get(url);	 
	      driver.manage().window().maximize();
		  List<WebElement> elementName = driver.findElements(By.xpath("//h4[contains(@class,'product-name')]"));
		  
		  for (WebElement element : elementName) {
			  System.out.println(element.getText());
			    
	              if(element.getText().contains("Brocolli")) {
	            	  
	            	  WebElement button = element.findElement(By.xpath("../div/button"));
	            	  button.click();
	            	  Thread.sleep(7000);
	            	  break;
	              }
			 }
		  driver.quit();
	  }

}
