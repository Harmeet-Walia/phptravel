package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestFlightBooking {

	public void testFlightBooking1(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(), 'Flights')]")).click();
		
		
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-orig-')]")).sendKeys("Mumbai");
//	driver.findElement(By.xpath("//input[starts-with(@id,'airports-inline-dest-')]")).sendKeys("Mumbai");
	
//		driver.findElement(By.id("s2id_autogen14")).click();
//
//		driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys("paris");
//		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[3]/div/span")).click();
//
//		driver.findElement(By.id("s2id_autogen16")).click();
//     //Destination
//		
//		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Berlin");
//		// driver.findElement(By.xpath("//div[[@id='select2-drop']/div/input")).sendKeys("Berlin");
//		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]/div/span")).click();
//		
//		//Departure Date
//		driver.findElement(By.name("departure")).click();
//		driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/tbody/tr[3]/td[7]")).click();
//		
//		//Return date
//		driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr[4]/td[5]")).click();
//		
//		//Classtype  dropdown selection
//		WebElement classType=driver.findElement(By.xpath("//*[@id='flight']/form/div[3]/div[3]/div/select"));
//		Select selectclassType=new Select(classType);
//		 selectclassType.selectByIndex(2);
		
		 
		 
		 
		//Guests
		driver.findElement(By.xpath("//*[@id='flight']/form/div[3]/div[4]/input")).click();
		Thread.sleep(3000);
		
		WebElement childrenGuest=driver.findElement(By.xpath("//*[@id='flightTravelers']/div/div/div[2]/section/div/div[2]/div[1]/select"));
		
		//*[@id="flightTravelers"]/div/div/div[2]/section/div/div[2]/div[1]/select
		Select noOfChildren=new Select(childrenGuest);
		noOfChildren.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@id='sumPassenger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='flight']/form/div[3]/div[5]/button")).click();
		 
		 

	}

}
