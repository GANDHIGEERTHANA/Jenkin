package POMPagesdemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution2 {
  
	  @Test
	  public void TC02() {
		  System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
		    WebDriver driver = new FirefoxDriver(); 
		    //to maximise the browser
		    driver.manage().window().maximize();
		    driver.get("https://demo.guru99.com/test/newtours/");
		    //how to work with ads
		    driver.findElement(By.name("userName")).sendKeys("mercury");
		    driver.findElement(By.name("password")).sendKeys("mercury");
		    driver.findElement(By.name("submit")).click();
		    driver.findElement(By.linkText("Flights")).click();
		    driver.close();
	  	
  }
}
