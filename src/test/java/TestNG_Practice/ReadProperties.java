package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ReadProperties {
	WebDriver driver;
	Properties prop;
	FileInputStream file;
	@BeforeClass
	  public void beforeClass() throws IOException {
		file=new FileInputStream(new File("C:\\Users\\manoh\\eclipse-workspace\\NewMavenDemo\\src\\test\\java\\TestNG_Practice\\config.properties"));
		prop=new Properties();
		prop.load(file);
		
		
		System.out.println("Pre-requisite");
			System.setProperty("webdriver.gecko.driver",prop.getProperty("FirefoxDriver")); 
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//open application
			driver.get(prop.getProperty("url"));
	  }
	
  @Test
  public void propertiescheck() {
	  System.out.println("Username is: "+prop.getProperty("uname")+"Password is: "+prop.getProperty("pword"));
	  driver.findElement(By.name("userName")).sendKeys(prop.getProperty("uname"));
	  driver.findElement(By.name("password")).sendKeys(prop.getProperty("pword"));
	 driver.findElement(By.name("submit")).click();
	 if(driver.getTitle().contains("Login"))
	 {
		 System.out.println("Valid input");
		 driver.findElement(By.linkText("SIGN-OFF")).click();
	 }
	 else
	 {
		 System.out.println("Invalid input");
	 }
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
