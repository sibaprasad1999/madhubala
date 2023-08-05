package com.actitime.pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHomePage 
{
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@FindBy(id = "container_tasks")
	private WebElement tasksLink;
	
	@FindBy(id = "container_users")
	private WebElement usersLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void tasksMethod()
	{
		js=(JavascriptExecutor)driver;

		wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(tasksLink));
		js.executeScript("arguments[0].click()", tasksLink);
	}
	
	public void usersMethod()
	{
		js=(JavascriptExecutor)driver;

		wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(usersLink));
		js.executeScript("arguments[0].click()", usersLink);
	}
	
	public void settingsMethod()
	{
		js=(JavascriptExecutor)driver;

		wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(settingsLink));
		js.executeScript("arguments[0].click()", settingsLink);
	}
	
	public void logoutMethod()
	{
		js=(JavascriptExecutor)driver;

		wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(logoutLink));
		js.executeScript("arguments[0].click()", logoutLink);
	}	
}