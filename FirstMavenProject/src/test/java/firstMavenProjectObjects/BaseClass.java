package firstMavenProjectObjects;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest
	public void beforemethod3()
	{
		System.out.println("This is  before test Class");
	
		//System.out.println("b");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is  before class");
	
		//System.out.println("b");
	}
	
	
	

	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("This is  before Method Annotation");
	
		//System.out.println("b");
	}
	
	@BeforeClass
	public void beforemethod()
	{
		System.out.println("This is  before  Class");
	
		//System.out.println("b");
	}
	
	
	@AfterTest
	public void aftermethod()
	{
		System.out.println("This is  After test Class");
	
		//System.out.println("b");
	}
	

}
