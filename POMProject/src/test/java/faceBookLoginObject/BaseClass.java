package faceBookLoginObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	static  WebDriver driver;
	
	@BeforeTest
	 public void launchBrowserFB()
	 {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Selenium File\\Chrome_exe\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		driver=  new ChromeDriver(option);
	
		option.addArguments("--disable-notifications");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	 }
	
	
	
	
@AfterClass
	
	public void closingBrowser()
	{
		driver.close();
	}
		
	}
	
	



