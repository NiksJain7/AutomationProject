package faceBookLoginObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FBLoginPageMaps extends BaseClass {
	
	WebElement  userName=driver.findElement(By.id("pass"));
	WebElement passWord=driver.findElement(By.id("loginbutton"));
	WebElement loginButton=driver.findElement(By.id("u_0_b"));
	

 public void enterUserName()
 {
	 userName.sendKeys("priya.singhai@yahoo.com");
	 
 }
 
 public void enterPassWord()
 {
	 passWord.sendKeys("p12345");
	 
 }
 
 public void clickLoginButton()
 {
	 loginButton.click();
	 
 }

	
	
	
	

}
