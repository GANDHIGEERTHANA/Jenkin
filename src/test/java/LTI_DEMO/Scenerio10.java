package LTI_DEMO;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenerio10 {
	WebDriver driver;
		
		@Test
		public void Testcase1() {
			System.out.println("Test case 1");
			//to maximise the browsser
					driver.manage().window().maximize();
				    driver.findElement(By.linkText("Register")).click();
				    driver.findElement(By.id("gender-female")).click();
				    driver.findElement(By.id("FirstName")).sendKeys("GandhiGeerthana");
				    driver.findElement(By.name("LastName")).sendKeys("Manoharan");
				    driver.findElement(By.id("Email")).sendKeys("manoharangeer@gmail.com");
				    driver.findElement(By.name("Password")).sendKeys("Manoharan");
				    driver.findElement(By.name("ConfirmPassword")).sendKeys("Manoharan");
				    driver.findElement(By.id("register-button")).click();
				    String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
					Assert.assertEquals("Your registration completed",actualresult);
				    
		}
		 @Test
		public void Testcase2() throws InterruptedException {
			System.out.println("Login");
			driver.findElement(By.partialLinkText("Log in")).click();
		    driver.findElement(By.id("Email")).sendKeys("manoharange@gmail.com");
		    driver.findElement(By.name("Password")).sendKeys("Manoharan");
		    driver.findElement(By.xpath("//input[@type='submit']/parent::div")).click();
		    String actualresult=driver.findElement(By.linkText("manoharange@gmail.com")).getText();
			Assert.assertEquals("manoharange@gmail.com",actualresult);
		 }
		    @Before
		public void before() {
			System.out.println("Pre-requisite");
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe"); 
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
