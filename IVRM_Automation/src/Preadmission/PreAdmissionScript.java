package Preadmission;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PreAdmissionScript extends BaseClass 
{
	@Test
	public void PreAdm_Login() throws InterruptedException
	{
		driver.findElement(By.id("login-username")).sendKeys("radha");
		driver.findElement(By.id("login-password")).sendKeys("Password@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//b[text()='Sign in ']")).click();
		
		
		
		
	}
}
