package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	WebDrivers browserType;
	
	By userInput  = By.name("uid");
	By passwordInput  = By.name("password");
	By loginButton  = By.name("btnLogin");
	
	public LoginPage(String browser) {
		
		browserType = new WebDrivers();
	    this.driver = browserType.getDriver(browser);
	    driver.get("https://www.demo.guru99.com/V4/index.php");
	}
	
	private void EnterUserId(String username) {
		WebElement usernameInput = driver.findElement(userInput);
		usernameInput.sendKeys(username);		
	}
	private void EnterPassword(String password) {
		WebElement passInput = driver.findElement(passwordInput);
		passInput.sendKeys(password);		
	}
	private void ClickLogin() {
		WebElement button = driver.findElement(loginButton);
		button.click();
	}
	
public HomePage Login(String user, String password) {	   
	   EnterUserId(user);
	   EnterPassword(password);
	   ClickLogin();
	   return new HomePage(driver);
   }
	
}
