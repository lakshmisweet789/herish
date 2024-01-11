package com.orangehrm_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.orangehrm_generic.baseclass;


public class login  extends baseclass
{
	@Test
		public void login() throws InterruptedException
		{
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='HI Collings']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	Thread.sleep(2000);
	}
	

}
