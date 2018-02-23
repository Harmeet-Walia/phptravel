package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestFlightBooking {

	public void testFlightBooking1(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(), 'Flights')]")).click();
		
		
	//enter departure city
		
	Thread.sleep(500);
	driver.switchTo().frame("travelstartIframe-dd7d2f33-38c3-4c69-baac-56d16157023b");
	driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-orig-')]")).sendKeys("Mumbai");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[starts-with(@id, 'typeahead')]")).click();
	
	//enter arrival city
	driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-dest')]")).sendKeys("Delhi");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[starts-with(@id, 'typeahead')]")).click();
	
	//select depart date
	driver.findElement(By.xpath("//button[@class='datepicker__next-month']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'8')]")).click();
	
		 
		 
		 
		
	}

}
