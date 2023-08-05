package com.actitime.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		Reporter.log("execution started" , true);
	}
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(url);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executionComplete()
	{
		Reporter.log("execution completed" , true);
	}
}