package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System Property for Chrome Driver   
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver = new FirefoxDriver(); 
	    //opening the application
	    driver.get("https://demo.guru99.com/test/newtours/");
	    //clicking the link tab
	    driver.findElement(By.linkText("REGISTER")).click();
	    //username text box field
	    driver.findElement(By.id("email")).sendKeys("mercury");
	    //password text field giving send keys to enter the text there
	    driver.findElement(By.name("password")).sendKeys("Yes");
	    //conform password by giving xpath
	    driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Yes");
	    //clicking button
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    //closing the driver
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    driver.get("https://opensource-demo.orangehrmlive.com/");
//	    driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//	    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
}
}