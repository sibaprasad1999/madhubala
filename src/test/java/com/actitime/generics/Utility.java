package com.actitime.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility 
{
	public static void highlightElement(WebDriver driver , WebElement element) throws InterruptedException
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].setAttribute('style', background:yellow')", element);
		Thread.sleep(3000);
		jsExecutor.executeScript("arguments[0].setAttribute('style', background:white')", element);
	}
}