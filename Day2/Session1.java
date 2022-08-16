package qalearning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Session1 {
  
	@Test
  public void OpenBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	  
      JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy(0,550)");
		
//		//Accept windows alerts 
//		
//		WebElement alertButton= driver.findElement(By.id("alertbtn"));
//		alertButton.click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
//	    
//		Thread.sleep(1000);
//		WebElement confirmButton= driver.findElement(By.id("confirmbtn"));
//		confirmButton.click();
//		Thread.sleep(1000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();

		
		
	
	  //WebElement radio1= driver.findElement(By.cssSelector("label[for='radio1'] input"));
		//click en un radio button
//	  WebElement radio1= driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/label[1]/input"));
//	   radio1.click();
//		//label[for='radio1'] input
//		////*[@id="radio-btn-example"]/fieldset/label[1]/input
//		
//	   //Escribir en un input field
//	   WebElement inputField = driver.findElement(By.id("name"));	   
//	   inputField.sendKeys("Otniel Abarca");
//	   
//	   //click en checkbox
//		  WebElement checkbox2= driver.findElement(By.name("checkBoxOption2"));
//		  checkbox2.click();
//		  
//		  Select staticDropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
//		  
//		  //select by index
//		  staticDropdown.selectByIndex(2);
//		  Thread.sleep(2000);
//		  
//		  //select by option
//		  staticDropdown.selectByValue("option3");
//		  Thread.sleep(2000);
//		  //select by text
//		  staticDropdown.selectByVisibleText("Option1");
		
//		WebElement inputDropdown = driver.findElement(By.id("autocomplete"));
//		inputDropdown.sendKeys("me");
//		
//		//Thread.sleep(6000);
////		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
////		
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='ui-menu-item'] div")));
//		
//		List<WebElement> dropdownValues = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
//		
//		for(WebElement country : dropdownValues) {
//			
//			System.out.println(country.getText());
//			if(country.getText().contains("Mexico")) {
//				country.click();
//			}						
//		}
// 	   
	   
		Thread.sleep(6000);
		
		driver.quit();
		
  }
}
