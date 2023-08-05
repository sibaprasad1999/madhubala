package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.ActitimeHomePage;
import com.actitime.pages.ActitimeLoginPage;


public class TC1_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	@Test(dependsOnMethods = "loginlogout")
	public void titlevalidate()
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
	    loginPage.titlevalidate();
	}
	@Test(dependsOnMethods = "titlevalidate")
	public void logout()
	{
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}