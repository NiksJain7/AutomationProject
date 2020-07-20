package faceBookLoginObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowserClass {
	
	 WebDriver driver;
		
		@BeforeMethod
		 public void launchBrowserFB()
		 {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\Selenium File\\Chrome_exe\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			driver= new ChromeDriver(option);
		
			option.addArguments("--disable-notifications");
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			
		 }
		
		
		
		
		
		@AfterMethod
		
		public void closingBrowser()
		{
			driver.close();
		}
			
		}


