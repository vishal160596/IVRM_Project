package Preadmission;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public WebDriver driver;
    @BeforeMethod
    public void open() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
    	//ChromeOptions options=new ChromeOptions();
    	//options.addArguments("--remote-allow-origin=*");
	    WebDriver driver=new ChromeDriver();
	    
 	    // driver.manage().window().maximize();
 	    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	     driver.get("https://ivrmstaging.vapssmartecampus.com/#/login/");
 	     Thread.sleep(5000);
 	     
    }
    
    
   @AfterMethod
   public void closeApp()
   {
	   driver.quit();
   }
}
