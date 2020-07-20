package facebookLoginTest;

import org.testng.annotations.Test;

import faceBookLoginObject.FBLoginPageMaps;

public class FBLoginPageTests extends FBLoginPageMaps {
	
	FBLoginPageMaps lpTest= new FBLoginPageMaps();
	//FBLoginPageTests lpTest2=new FBLoginPageTests();
	

	@Test
	public void loginTest() 
	{
		lpTest.enterUserName();
		lpTest.enterPassWord();
		lpTest.clickLoginButton();
		
		
	}
	
	
	
	
	

}
