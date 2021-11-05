package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenrio1 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo1 oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginasUser1();
		logout();
		loginasUser2();
		logout();
		loginasUser3();
		logout();
		login();
		modifyUser1();
		modifyUser2();
		modifyUser3();
		logout();
		modifyloginasUser1();
		logout();
		modifyloginasUser2();
		logout();
		modifyloginasUser3();
		logout();
		login();
		deleteUser1();
		deleteUser2();
		deleteUser3();
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
	
	static void createUser1()
	{
		try
		{
			oPage.getuser().click();
			oPage.getadduser().click();
			oPage.getfname().sendKeys("user1");
			oPage.getlname().sendKeys("demo1");
			oPage.getemail().sendKeys("d@gmail.com");
			oPage.getusername().sendKeys("user1");
			oPage.getpassword().sendKeys("1234");
			oPage.getretypepassword().sendKeys("1234");
			oPage.getclick().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{
		try
		{
			oPage.getuser().click();
			oPage.getadduser().click();
			oPage.getfname().sendKeys("user2");
			oPage.getlname().sendKeys("demo2");
			oPage.getemail().sendKeys("d2@gmail.com");
			oPage.getusername().sendKeys("user2");
			oPage.getpassword().sendKeys("12345");
			oPage.getretypepassword().sendKeys("12345");
			oPage.getclick().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oPage.getuser().click();
			oPage.getadduser().click();
			oPage.getfname().sendKeys("user3");
			oPage.getlname().sendKeys("demo3");
			oPage.getemail().sendKeys("d3@gmail.com");
			oPage.getusername().sendKeys("user3");
			oPage.getpassword().sendKeys("123456");
			oPage.getretypepassword().sendKeys("123456");
			oPage.getclick().click();
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
	
	static void loginasUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("1234");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getweelcomewindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginasUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getweelcomewindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginasUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("123456");
			oPage.getLogin().click();
			Thread.sleep(4000);
			oPage.getweelcomewindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyUser1()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getmodifyuser1().click();
			Thread.sleep(2000);
			oPage.getpassword().clear();
			oPage.getpassword().sendKeys("12345");
			oPage.getretypepassword().clear();
			oPage.getretypepassword().sendKeys("12345");
			oPage.getclick().click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser2()
	{
		try
		{
			
			oPage.getmodifyuser2().click();
			Thread.sleep(2000);
			oPage.getpassword().clear();
			oPage.getpassword().sendKeys("123456");
			oPage.getretypepassword().clear();
			oPage.getretypepassword().sendKeys("123456");
			oPage.getclick().click();
			Thread.sleep(2000);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser3()
	{
		try
		{
			
			oPage.getmodifyuser3().click();
			Thread.sleep(2000);
			oPage.getpassword().clear();
			oPage.getpassword().sendKeys("1234567");
			oPage.getretypepassword().clear();
			oPage.getretypepassword().sendKeys("1234567");
			oPage.getclick().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyloginasUser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("12345");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifyloginasUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("123456");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifyloginasUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("1234567");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteUser1()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getmodifyuser1().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser2()
	{
		try
		{

			oPage.getmodifyuser1().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser3()
	{
		try
		{
	
			oPage.getmodifyuser1().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
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
