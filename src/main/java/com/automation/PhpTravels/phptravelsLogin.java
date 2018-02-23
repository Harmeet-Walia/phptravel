package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class phptravelsLogin {
	
	public void phplogin(WebDriver driver) throws InterruptedException{
		Thread.sleep(4000);
		driver.findElement(By.id("//li[@id='li_myaccount']")).click();
		
	}

}
