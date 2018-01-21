package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisaApprovalForm {
	
	public void visaApproval(WebDriver driver){
		
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("modi12@gmail.com");
	}

}
