package com.automation.PhpTravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class PHPTravelsTestSuite {
	public static void main(String[] args) throws InterruptedException

	{
		PHPTravelsTestSuite travelSiteTest = new PHPTravelsTestSuite();
		travelSiteTest.runTests();
		// travelSiteTest.runTests();

	}

	public void runTests() throws InterruptedException {
		WebDriver driver = getDriver();
		
		phptravelsLogin login=new phptravelsLogin();
		login.phplogin(driver);
		

		// TestMenuBar testMenuBar = new TestMenuBar();
//		 testMenuBar.testMainToolBar(driver);
//		 TestHotelBooking testHotelBooking=new TestHotelBooking();
//		 testHotelBooking.testHotelBooking1(driver);
		
//         TestFlightBooking testFlightBooking = new TestFlightBooking();
//	     testFlightBooking.testFlightBooking1(driver);

//		 TestToursBooking testTours=new TestToursBooking();
//		 testTours.testToursBooking1(driver);
		
//		TestCarsBooking testcarBooking=new TestCarsBooking();
//		testcarBooking.testCarsBooking1(driver);
//	
//		TestVisaBooking visabooking=new TestVisaBooking();
//		visabooking.visaBooking(driver);



	}

	public WebDriver getDriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/rawalia/Harmeet/SeleniumDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		return driver;

	}
	
	public WebDriver getDriver1() {
		System.setProperty("webdriver.gecko.driver","/Users/rawalia/Harmeet/SeleniumDriver/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	}
}
