package com.git.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
public static WebDriver driver;
	
	public static void openChrome() {
	System.setProperty("webdriver.chrome.driver","//Users//revantha//Downloads//chromedriver-4");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
}
}