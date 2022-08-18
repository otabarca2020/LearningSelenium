package APITest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class LearningDeleteTest {
  @Test
  public void Delete() {
	  
	  RestAssured.baseURI="https://reqres.in/";
	  	
	  //given  //parametros en el header or cabecera si es POST, pasamos un body
	  //when  //action o verbo y la url del servicio
	  //then  //validaciones	  
	  given().log().all().
	  when().delete("api/users/2").
	  then().assertThat().log().all().statusCode(204);
  }
}
