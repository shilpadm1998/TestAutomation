package com.sgtestin.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		enterSalaryForThePersonSachinTendlukar();
		
	}
	
	static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("file:///F:/Html/WebTableHTML.html");
			Thread.sleep(4000);
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	static void enterSalaryForThePersonSachinTendlukar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
		
	}

}
