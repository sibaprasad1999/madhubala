package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;


	
public class ActitimeLoginPage extends BasePage implements AutoConstant
{

	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextfield;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;

	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws IOException, InterruptedException
	{
		visibilityofElement(driver, usernameTextfield);
		//Utility. highlightElement(driver,usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 0));
		//Screenshot1.takeElementScreenshot(usernameTextfield, "username");
		
		visibilityofElement(driver, passwordTextfield);
		//Utility. highlightElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 1));
		//Screenshot1.takeElementScreenshot(passwordTextfield, "password");
		
		visibilityofElement(driver, keepmeloggedinCheckbox);
		//Utility. highlightElement(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		//Screenshot1.takeElementScreenshot(keepmeloggedinCheckbox, "keepmeloggedin");
		
		visibilityofElement(driver, loginButton);
		//Utility. highlightElement(driver,loginButton );
		javascriptClick(driver, loginButton);
		//Screenshot1.takeElementScreenshot(loginButton, "login");
	}
	
	public void titlevalidate()
	{
		//titlecontains(driver, "Enter");
		//gettitle(driver, "actiTIME - Enter Time-Track");
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}
}