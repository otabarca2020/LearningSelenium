package parametersTestNG;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningJsonTest {
  @Test
  public void f() throws IOException, ParseException, InterruptedException {
	  WebDriver driver;
      System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");   
	  driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      driver.manage().window().maximize();
	  WebElement inputName = driver.findElement(By.name("enter-name"));
	  
	  ReadingJson obj = new ReadingJson();
		String name = obj.readJSONData("first name");
	  inputName.sendKeys(name);
	  System.out.println(name);
	  Thread.sleep(5000);
  }
}
