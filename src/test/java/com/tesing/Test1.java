package com.tesing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test1
{
	WebDriver driver;
	@Test
	public void firefoxdriver()
	{
		//driver=new FirefoxDriver();
		System.out.println("..............................firefoxDriver...................");
	}
	@Test
	public void chromedriver()
	{
		//driver=new FirefoxDriver();
		System.out.println("..............................chromedriver...................");
	}
	@Test
	public void iedriver()
	{
		//driver=new FirefoxDriver();
		System.out.println("..............................iedriver...................");
	}
}
