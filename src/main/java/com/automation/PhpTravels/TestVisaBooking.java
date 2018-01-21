package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestVisaBooking {
	
	
	public void visaBooking(WebDriver driver) throws InterruptedException{
		//Click on Visa
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[5]/a/span")).click();
		
		//From Country input box
		Thread.sleep(3000);
		driver.findElement(By.id("s2id_autogen2")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Australia");
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div/span")).click();
		
		//To country input box
		driver.findElement(By.id("s2id_autogen4")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[2]/div/span")).click();
		
		//Search
		driver.findElement(By.xpath("//*[@id='VISA']/form/div[2]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[2]/div[1]/input")).sendKeys("me@you.com");
	}

}
