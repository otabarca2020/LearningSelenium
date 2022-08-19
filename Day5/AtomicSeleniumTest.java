package APITest;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class AtomicSeleniumTest {
  @Test
  public void LoginSeleniumAPI() {
	  WebDriver driver;
	  
	  RestAssured.baseURI="https://rahulshettyacademy.com/";	  	  	  
	  LoginResponse resp= given().log().all().header("Content-Type","application/json").
	  body("{\"userEmail\":\"learning@gmail.com\",\"userPassword\":\"BD5QKJ@wVNWjqJi\"}").
	  when().post("api/ecom/auth/login").as(LoginResponse.class);	  
	  System.out.println(resp.token);
	  	  
      System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
      driver = new ChromeDriver();
      
	  	  
  }
}
