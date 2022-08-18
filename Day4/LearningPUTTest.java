package APITest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class LearningPUTTest {
	
	
	
	  @Test
	  public void LearningPUT() {
		 
		  
		  /////// validar valor en response
		  
		  RestAssured.baseURI="https://reqres.in/";
		  //
		  given().log().all().header("Content-Type","application/json").
		  body("{\n"
		  		+ "    \"name\": \"Otniel Abarca\",\n"
		  		+ "    \"job\": \"tecnologico\"\n"
		  		+ "}").
		  when().put("api/users/2").then().log().all().assertThat().statusCode(200);	  
		  	  
	  }
	

}
