package Preadmission;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PreAdmissionScript extends BaseClass 
{
	@Test
	public void ApplicationForm() throws InterruptedException
	{
		driver.findElement(By.id("login-username")).sendKeys("radha");
		driver.findElement(By.id("login-password")).sendKeys("Password@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"style-4\"]/ui-view/div[1]/div[2]/div[2]/div[2]/div[1]/div/form/footer/div/div/div[1]/span/button/b"));
		
	
	}
}
