package faceBookLoginObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FBCreateAccountPageMaps extends BaseClass {

	@Test
	public void CreateAccount()
	{
		WebElement firstName=driver.findElement(By.name("firstname"));
		WebElement surName=driver.findElement(By.name("lastname"));
		WebElement newEmail=driver.findElement(By.name("reg_email__"));
		WebElement newPass=driver.findElement(By.id("password_step_input"));
		WebElement day= driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByVisibleText("21");
		int size1= s1.getOptions().size();
		System.out.println(size1);
		Select s2=new Select(day);
		s2.selectByVisibleText("JAN");
		int size2= s2.getOptions().size();
		System.out.println(size2);
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1991");
		int size3= s3.getOptions().size();
		System.out.println(size3);
		

	}
}
