package com.automation.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
		//Arrival Date in India
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[12]/div[1]/table/thead/tr[1]/th[3]")).click(); //move to next month calender
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[12]/div[1]/table/tbody/tr[3]/td[5]")).click();  //15th Feb
		
		//Departure date from India
		driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[2]/div[3]/input")).click();
		driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[3]")).click(); //move to next month calender 
		driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/tbody/tr[4]/td[7]")).click(); //24th Feb
		driver.findElement(By.xpath("//*[@id='ivisa-global-fields']")).click();
		
		//Reason for travel
		
		WebElement reasonForTravel=driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[2]/div[4]/select"));
		Select travelReason=new Select(reasonForTravel);
		travelReason.selectByIndex(3);
		
		//Port of Arrival
		 WebElement portOfArrival=driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[3]/div[1]/select"));
		 Select arrivalPort=new Select(portOfArrival);
		 arrivalPort.selectByIndex(6);
		 //Phone
		 driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[3]/div[2]/div")).click();
		 driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[3]/div[2]/div/input")).sendKeys("3245345345");
		 
		 //Home Country
		 WebElement homeCountry=driver.findElement(By.xpath("//*[@id='ivisa-global-fields']/div[3]/div[3]/select"));
		 Select homeCountry1=new Select(homeCountry);
		 homeCountry1.selectByIndex(14);
		 
		 //Applicant's first name
		 driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[1]/input")).sendKeys("John");
		//Applicant's last name
		
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[2]/input")).sendKeys("Gerry");
	   
		//Nationality in passport
		WebElement nationality=driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[3]/select"));
		Select nationalityInPassport=new Select(nationality);
		nationalityInPassport.selectByIndex(10);
		
		//Birthday
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[4]/input")).click();
		//month
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.xpath("//*[@id='dp_month']"));
		Select birthdaymonth=new Select(month);
		birthdaymonth.selectByIndex(4);
		
		//Day
		WebElement day=driver.findElement(By.xpath("//*[@id='dp_day']"));
		Select birthdayDay=new Select(day);
		birthdayDay.selectByIndex(20);
		//Year
		WebElement year=driver.findElement(By.xpath("//*[@id='dp_year']"));
		Select birthdayYear=new Select(year);
		birthdayYear.selectByIndex(20);
		//gender
		
		driver.findElement(By.xpath("//*[@id='dp_save']")).click();

		WebElement gender= driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[5]/select"));
		Select selectGender=new Select(gender);
		selectGender.selectByValue("male");
		
		//Passport number
		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[6]/input")).sendKeys("7654894589");
	
		//Passport issued date
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[7]/input")).click();
	
	
		Thread.sleep(2000);

		WebElement passportissuedmonth=driver.findElement(By.xpath("//*[@id='dp_month']"));
		Select passportissuedmonth1= new Select(passportissuedmonth);
		passportissuedmonth1.selectByIndex(6);
		
		WebElement passportissuedday=driver.findElement(By.xpath("//*[@id='dp_day']"));
		Select passportissuedday1=new Select(passportissuedday);
		passportissuedday1.selectByIndex(23);
		
		WebElement passportissuedyear=driver.findElement(By.xpath("//*[@id='dp_year']"));
		Select passportissuedyear1=new Select(passportissuedyear);
		passportissuedyear1.selectByIndex(23);
		
		driver.findElement(By.xpath("//*[@id='dp_save']")).click();
		//Passport expiration date

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[8]/input")).click();
		Thread.sleep(2000);

		
		
		WebElement passportexpirationmonth=driver.findElement(By.xpath("//*[@id='dp_month']"));
		Select passportexpirationmonth1= new Select(passportexpirationmonth);
		passportexpirationmonth1.selectByIndex(9);
		
		WebElement passportexpirationday=driver.findElement(By.xpath("//*[@id='dp_day']"));
		Select passportexpirationday1=new Select(passportexpirationday);
		passportexpirationday1.selectByIndex(23);
		
		WebElement passportexpirationyear=driver.findElement(By.xpath("//*[@id='dp_year']"));
		Select passportexpirationyear1=new Select(passportexpirationyear);
		passportexpirationyear1.selectByIndex(20);
		driver.findElement(By.xpath("//*[@id='dp_save']")).click();
		
		//Passport issued place
		WebElement issuedPlace=driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[2]/div[9]/select"));
		Select passportIssuedPlace=new Select(issuedPlace);
		passportIssuedPlace.selectByIndex(10);
		
		//India visa Type
		WebElement visatype=driver.findElement(By.xpath("//*[@id='body-section']/div[1]/span/div/div[4]/section[2]/div[3]/div[1]/select"));
		Select indiaVisaType=new Select(visatype);
		indiaVisaType.selectByValue("business");
		driver.quit();
		
		

		
		
	}
	
	

}
