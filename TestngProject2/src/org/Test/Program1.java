package org.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Program1 {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setUp()  {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Test
	public void verifytitle() {
     driver.getCurrentUrl();
	}
	
	@Test
	public void mobiles() {
		driver.findElement(By.xpath("//a[text()='Mobiles'][1]")).click();
	

	}
	
	@Test
	public void bestseller() {
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
	

	}
	@AfterMethod
	
     public void teardown()  {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
