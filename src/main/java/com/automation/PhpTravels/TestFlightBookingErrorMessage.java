package com.automation.PhpTravels;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlightBookingErrorMessage {
	WebDriver driver;

//	@Test
//	public void testFlightError() throws InterruptedException {
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//span[contains(text(), 'Flights')]")).click();
//		Thread.sleep(500);
//		
//		// enter departure city
//		driver.switchTo().frame("travelstartIframe-dd7d2f33-38c3-4c69-baac-56d16157023b");
//		driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-orig-')]")).sendKeys("Mumbai");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[starts-with(@id, 'typeahead')]")).click();
//
//		// enter arrival city
//		driver.findElement(By.xpath("//input[starts-with(@id, 'airports-inline-dest')]")).sendKeys("Delhi");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[starts-with(@id, 'typeahead')]")).click();
//
//		driver.findElement(By.id("search-for-flights-button")).click();
//		Thread.sleep(1000);
//		boolean invalidDateError=driver.findElement(By.xpath("//span[contains(text(),'Invalid date selection')]")).isDisplayed();
//		assertEquals(true,invalidDateError);
//		System.out.println(invalidDateError);
//	}
//	
//	//chkg if error msg is displayed if only departure date and return date is mentioned
//	@Test
//	public void testFlightError2() throws InterruptedException{
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//span[contains(text(), 'Flights')]")).click();
//		Thread.sleep(500);
//		driver.switchTo().frame("travelstartIframe-dd7d2f33-38c3-4c69-baac-56d16157023b");
//		//enter departure date
//		driver.findElement(By.xpath("//span[contains(text(), 'Depart')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(), '22')]")).click();
//		
//		//clicking on next in return date and selectng 8 March
//		driver.findElement(By.xpath("//button[@class='datepicker__next-month']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'8')]")).click();
//		
//		//clicking on number of passengers
//		driver.findElement(By.xpath("//button[@class='stepper--plus']")).click();
//		
//		//click on search
//		driver.findElement(By.id("search-for-flights-button")).click();
//		
//		boolean invalidDateError=driver.findElement(By.xpath("//span[contains(text(),'Some fields are incorrect')]")).isDisplayed();
//		assertEquals(true,invalidDateError);
//		
//		
//	}
	@Test
	public void chkErrorinTourBooking() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'Tours')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://www.phptravels.net/tours/thailand/bangkok/6-Days-Around-Thailand' and @b='6 Days Around Thailand']")).click();
		
	}

	@Before
	public void getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/rawalia/Harmeet/SeleniumDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);



	}
	
//	@After
//	public void quitBrowser(){
//		driver.quit();
//		
//	}

}
