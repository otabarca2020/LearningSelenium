package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDrivers {
		
	public WebDriver getDriver(String brownserName) {
		
		switch(brownserName) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");			
			return new ChromeDriver();
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\chromeDriver\\geckodriver.exe");		
			return new FirefoxDriver();
			
		}
		return null;
				
	}

}
