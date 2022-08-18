package APITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class LearningGETTest {
  @Test
  public void CallGETTest() {
	  
	  RestAssured.baseURI="https://reqres.in/";
	  	
	  //given  //parametros en el header or cabecera si es POST, pasamos un body
	  //when  //action o verbo y la url del servicio
	  //then  //validaciones	  
	  given().log().all().
	  when().get("api/users?page=2").
	  then().assertThat().log().all().statusCode(200);
	  
	  
  }
}
