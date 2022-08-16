package qalearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void f() {
		System.setProperty("webdriver.gecko.driver", "C:\\chromeDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
  }

}
