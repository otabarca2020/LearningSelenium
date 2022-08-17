package qatraining;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LearningParametersTest {
	WebDriver driver;
	
	@BeforeTest  
	public void beforeTest() {
	      System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");   
		  driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.manage().window().maximize();
	      
	      
	  }
	
  @Test
  @Parameters({"inputName"})
  public void parametersTest(String name) throws InterruptedException {
	
	  WebElement inputName = driver.findElement(By.name("enter-name"));
	  inputName.sendKeys(name);
	  System.out.println(name);
	  Thread.sleep(5000);
	  
  }


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
