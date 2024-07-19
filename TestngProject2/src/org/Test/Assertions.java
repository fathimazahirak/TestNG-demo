package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//verfiy actual result and expected result

public class Assertions {
	WebDriver driver ;
	
	
	@Test
	public   void google() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon",Keys.ENTER);
		String expectedTitle = "Amazon - Google Search";
		String Title = driver.getTitle();
	    System.out.println(Title);
		Assert.assertEquals(Title, expectedTitle, "title mismatched:");
		//driver.quit();
		
		
		
		
	}
   
	
	
	
	
	
	
	
	
	
	

}
