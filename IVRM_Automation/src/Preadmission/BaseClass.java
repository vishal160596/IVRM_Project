package Preadmission;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://ivrmstaging.vapssmartecampus.com/#/login/");
		Thread.sleep(8000);
	}
	
    
    
   @AfterMethod
   public void closeApp()
   {
	   driver.quit();
   }
}
