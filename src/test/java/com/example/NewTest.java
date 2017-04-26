package com.example;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	String currentDir = System.getProperty("user.dir");
	
	@Test
	public void sampleTest() {
		driver.get("http://www.facebook.com");
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", currentDir+"//drivers//chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new HtmlUnitDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
