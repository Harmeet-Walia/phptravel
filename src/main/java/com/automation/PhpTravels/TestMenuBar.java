package com.automation.PhpTravels;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class TestMenuBar {
	
	
	
	
	
	public void testMainToolBar(WebDriver driver) throws InterruptedException{
		
		
		
		
		Thread.sleep(2000); 
		
		//Flights is too slow , makes the run very slow
		
		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[1]/a/span[2]")).click();
		
		driver.navigate().back();
		
		//Hotels
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[2]/a/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='body-section']/div[5]/div[3]/div/table/tbody/tr[1]/td/div[2]/div/div[5]/a/button")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='body-section']/div[5]/div[3]/div/table/tbody/tr[6]/td/div[2]/div/div[5]/a/button")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//Tours
		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[3]/a/span[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//Cars
		
		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[4]/a/span[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//Visa
		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[5]/a/span[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//offers
		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[6]/a/span[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		//Blog
//		driver.findElement(By.xpath("//*[@id='offcanvas-menu']/ul/li[7]/a/span[2]']")).click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
		
//		driver.quit();
		
	}
	
	

}
