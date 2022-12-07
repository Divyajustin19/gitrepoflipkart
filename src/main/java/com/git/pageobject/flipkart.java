package com.git.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.git.baseclass.baseclass;

public class flipkart  extends baseclass {

	
	public static void login()
	{
		WebElement username= driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		username.sendKeys("9025445405");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
		password.sendKeys("Apple@6s");
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		login.click();
	}
}
