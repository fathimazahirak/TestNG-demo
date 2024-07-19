package org.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

  
public class Orangehrm {
	WebDriver driver;
	
	@Test
	public void launchapp() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	@Test
	public void login() {
		WebElement user=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void myinfo() {
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		

	}
	
	@Test
	public void verifymyinfo() {
		System.out.println(driver.findElement(By.xpath("//a[text()='Personal Details']")).isDisplayed());
		//driver.quit();
		

	}
	
   @Test
	public void verifylogin() {
		WebElement element=driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());	
		System.out.println(element.getText());
		driver.quit();
		
	}
	

}
