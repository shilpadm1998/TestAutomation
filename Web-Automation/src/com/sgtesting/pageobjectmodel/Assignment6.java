package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6
{
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo1 oPage=null;
	public static void main(String[] args) 
	{
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oPage=new ActiTimeDemo1(oBrowser);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{

			oBrowser.navigate().to("http://localhost:82/user/submit_tt.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createCustomer()
	{
		try
		{
			oPage.getcreatecustomer().click();
			Thread.sleep(1000);
			oPage.getaddnew().click();
			Thread.sleep(1000);
			oPage.getcustomer().click();
			Thread.sleep(2000);
			oPage.getwritecustomername().sendKeys("User1");
			Thread.sleep(1000);
			oPage.getclickcustomer().click();
			Thread.sleep(1000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createProject()
	{
		try
		{
			oPage.getaddnew().click();
			Thread.sleep(1000);
			oPage.getnewproject().click();
			Thread.sleep(1000);
			oPage.getprojectPopup_projectNameField().sendKeys("java");
			Thread.sleep(1000);
			oPage.getcreateproject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyProject()
	{
		try
		{
			
			oPage.geteditButtonProject().click();
			Thread.sleep(1000);
			oPage.getmodifyproject().click();
			Thread.sleep(1000);
			oPage.getmodifyProjectname().clear();
			Thread.sleep(1000);
			oPage.getmodifyProjectname().sendKeys("java123");
			Thread.sleep(4000);
			oPage.getclosebutton().click();
			Thread.sleep(4000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oPage.geteditButtonProject().click();
			Thread.sleep(4000);
			oPage.getdeleteprojectaction().click();
			Thread.sleep(2000);
			oPage.getdeleteprojectbutton().click();
			Thread.sleep(2000);
			oPage.getdeletepermanently().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			oPage.getclickcustomeruser().click();
			Thread.sleep(2000);
			oPage.getcustomeruser().click();
			Thread.sleep(2000);
			oPage.getdeletecustomer().click();
			Thread.sleep(2000);
			oPage.getdeletecustomerpermanently().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	

}
