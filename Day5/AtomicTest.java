package APITest;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class AtomicTest {
  @Test
  public void LoginSucessful() {
	  RestAssured.baseURI="https://rahulshettyacademy.com/";
	  //declarar el header y poner el body cuando es un POST
	  given().log().all().header("Content-Type","application/json").
	  body("{\"userEmail\":\"learning@gmail.com\",\"userPassword\":\"BD5QKJ@wVNWjqJi\"}").
	  when().post("api/ecom/auth/login").then().log().all().assertThat().statusCode(200);
	  
  }
  
    
  @Test
  public void LoginUnsuccessful() {
	  
	  RestAssured.baseURI="https://rahulshettyacademy.com";
	  //declarar el header y poner el body cuando es un POST
	  given().log().all().header("Content-Type","application/json").
	  body("{\"userEmail\":\"learning@gmail.com\",\"userPassword\":\"BD5QKJ@wVNWi\"}").
	  when().post("api/ecom/auth/login").then().log().all().assertThat().statusCode(400);
	  
  }
}
