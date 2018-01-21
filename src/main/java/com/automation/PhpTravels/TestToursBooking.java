package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestToursBooking {

	public void testToursBooking1(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/div/div/div[1]/div/ul/li[3]/a/span")).click();

		Thread.sleep(3000);
		// Location
		driver.findElement(By.id("s2id_autogen12")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li/ul/li/div")).click();
		Thread.sleep(2000);

		// Checkin--sometimes it works...sometimes it doesnot ;-(
		driver.findElement(By.xpath("//*[@id='tchkin']/input")).click();
		 driver.findElement(By.xpath("/html/body/div[17]/div[1]/table/tbody/tr[4]/td[6]")).click(); 
		 //26Th jan

		// No of Guests
		WebElement element = driver.findElement(By.xpath("//*[@id='TOURS']/form/div[2]/div[2]/select"));
		Select select = new Select(element);
		select.selectByVisibleText("1");

		// Tour Type

		driver.findElement(By.id("s2id_tourtype")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[4]/div")).click();

		// search
		driver.findElement(By.xpath("//*[@id='TOURS']/form/div[2]/div[4]/button")).click();
		driver.navigate().back();

	}

}
