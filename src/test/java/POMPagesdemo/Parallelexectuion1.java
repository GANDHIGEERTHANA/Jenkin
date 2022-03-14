package POMPagesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallelexectuion1 {
  
	  @Test
		public void TC01() {
		  System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
		    WebDriver driver = new FirefoxDriver(); 
		    driver.manage().window().maximize();
		    driver.get("http://demowebshop.tricentis.com/");
		    driver.findElement(By.partialLinkText("Log in")).click();
		    driver.findElement(By.id("Email")).sendKeys("manoharange@gmail.com");
		    driver.findElement(By.name("Password")).sendKeys("Manoharan");
		    driver.findElement(By.xpath("//input[@type='submit']/parent::div")).click();
		    driver.close();
  }
}
