package APITest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class LearningPostTest {
  @Test
  public void LearningPost() {
	  
//	  RestAssured.baseURI="https://reqres.in/";
//	  //declarar el header y poner el body cuando es un POST
//	  given().log().all().header("Content-Type","application/json").
//	  body("{\n"
//	  		+ "    \"name\": \"Otniel Abarca\",\n"
//	  		+ "    \"job\": \"tecnologico\"\n"
//	  		+ "}").
//	  when().post("api/users").then().log().all().assertThat().statusCode(201);
	  
	  /////// validar valor en response
	  
	  RestAssured.baseURI="https://reqres.in/";
	  //declarar el header y poner el body cuando es un POST
	  given().log().all().header("Content-Type","application/json").
	  body("{\n"
	  		+ "    \"name\": \"Otniel Abarca\",\n"
	  		+ "    \"job\": \"tecnologico\"\n"
	  		+ "}").
	  when().post("api/users").then().log().all().assertThat().statusCode(201).
	  body("name", equalTo("Otniel"));	  
	  	  
  }
}
