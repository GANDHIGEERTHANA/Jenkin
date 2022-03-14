package LTI_DEMO;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JUnitExercise2 {
	WebDriver driver;
	@Test
	public void Testcase1() {
		System.out.println("Test case 1");
		//register and login iruka anga nu check pandro with isdipayed use panni so inga asser user panirukom asser.asserttru nu use pannanu
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		Assert.assertTrue(registerlink.isDisplayed());
		Assert.assertTrue(loginlink.isDisplayed());		
		//veru assert true nu matu use pannnum na import statement la assert iruka place la import static nu assert statement kudutha verum asserttrue use pannalam
	}
	
	 @Test
		public void Testcase2() throws InterruptedException {
		 	System.out.println("Login");
			driver.findElement(By.partialLinkText("Log in")).click();
		    driver.findElement(By.id("Email")).sendKeys("manoharange@gmail.com");
		    driver.findElement(By.name("Password")).sendKeys("Manoharan");
		    driver.findElement(By.xpath("//input[@type='submit']/parent::div")).click();
		 //verifying the login success or not in different ways 
		    String actualresult=driver.findElement(By.linkText("manoharange@gmail.com")).getText();
			Assert.assertEquals("manoharange@gmail.com",actualresult);
			//using contains 
			Assert.assertTrue(actualresult.contains("manoharange@gmail.com"));
			//using finelemnt link text method
			Assert.assertTrue(driver.findElement(By.linkText("manoharange@gmail.com")).isEnabled());
	 }
		@Before
		public void before() {
			System.out.println("Pre-requisite");
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe"); 
			//import point note it
			driver=new FirefoxDriver();
			//open application
			driver.get("http://demowebshop.tricentis.com/");
		}
		@After
		public void after() {
			System.out.println("Post-Condition");
			driver.close();
	}
	}


