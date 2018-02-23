package com.automation.PhpTravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestLabel {
	WebDriver driver;

	@Test
	public void testLabel1() {
		SoftAssert softassertion = new SoftAssert();
		boolean callnwText = driver.findElement(By.xpath("//span[contains(text(), 'Call Now:')]")).isDisplayed();
		softassertion.assertEquals(true, callnwText);
		System.out.println(callnwText);
	}

	@Test
	public void testLabel2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		SoftAssert softassertion1 = new SoftAssert();

		boolean smallpic = driver.findElement(By.xpath("//i[@class='fa fa-building-o']")).isDisplayed();
				

		softassertion1.assertEquals(true, smallpic);
		System.out.println(smallpic);
		softassertion1.assertAll();
		
		boolean featuredHotels= driver.findElement(By.xpath("//h2[contains(text(),' Featured Hotels            ')]")).isDisplayed();
		System.out.println(featuredHotels);
		
		

	}
	@BeforeTest
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "//Users/rawalia/Harmeet/SeleniumDriver/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.phptravels.net");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;
	}

}

		
		
		
		
	
		
		
	

	