package com.orangehrm_generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass  implements frame
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("--start-maximized--");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	//ok
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();

}

}
