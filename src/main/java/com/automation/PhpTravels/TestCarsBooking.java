package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCarsBooking {
	
	public void testCarsBooking1(WebDriver driver) throws InterruptedException{
		
		Thread.sleep(3000);
		//Click on Cars tab
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[4]/a/span")).click();
		Thread.sleep(3000);
		
		//Pickup
		driver.findElement(By.xpath("//*[@id='s2id_autogen6']")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div")).click();
		
		
		//Depart
		driver.findElement(By.name("pickupdate")).click();
		driver.findElement(By.xpath("/html/body/div[17]/div[1]/table/tbody/tr[4]/td[5]")).click();
		
		//return
		driver.findElement(By.xpath("/html/body/div[18]/div[1]/table/tbody/tr[4]/td[6]")).click();
		
		//Time
		WebElement time=driver.findElement(By.name("timeDepart"));
		Select departTime=new Select(time);
		departTime.selectByIndex(16);  //8 AM
		
		//Drop off
		driver.findElement(By.id("s2id_autogen8")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/div")).click();
		
		//ReturnTime
		WebElement returntime=driver.findElement(By.name("timeReturn"));
		Select returnTime1=new Select(returntime);
		returnTime1.selectByIndex(14	);  //7 AM
		
		//Search
		driver.findElement(By.xpath("//*[@id='CARTRAWLER']/form/div[9]/input[5]")).click();
		
		
		//driver.quit();
		
	}

}
