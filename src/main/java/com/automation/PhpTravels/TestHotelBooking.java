package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestHotelBooking {
	
	public void testHotelBooking1(WebDriver driver) throws InterruptedException{
		Thread.sleep(3000);
		
		//click on Hotels
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[1]/a/span")).click();
		
		//clicking on location
		driver.findElement(By.xpath("//*[@id='s2id_autogen10']")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Amsterdam");
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/ul/li/div/span")).click();
		
		
		driver.findElement(By.name("checkin")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[16]/div[1]/table/tbody/tr[4]/td[6]")).click();
		driver.findElement(By.xpath("/html/body/div[17]/div[1]/table/tbody/tr[5]/td[4]")).click();
		
		WebElement AdultsDropDown=driver.findElement(By.id("adults"));
		Select NoOfAdults= new Select(AdultsDropDown);
		NoOfAdults.selectByIndex(3);
		
		WebElement ChildDropDown=driver.findElement(By.id("child"));
		Select NoOfChildren= new Select(ChildDropDown);
		NoOfChildren.selectByIndex(2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='HOTELS']/form/div[3]/div[3]/button")).submit();
		
		
		
		
		
		
	}

}
