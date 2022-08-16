package TestCases;

import org.testng.annotations.Test;

import POM.LoginPage;

public class LoginTest1 {
	
	
	
  @Test
  public void f() {
	  
	  
	  LoginPage login = new LoginPage("Chrome");	  
	  login.Login("mngr431908", "uhUbagU");
	  
	  //assert
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
