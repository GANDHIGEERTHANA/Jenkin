package TestNG_Practice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import POMPagesdemo.HomePageclass;
import POMPagesdemo.LoginPageclass;
import POMPagesdemo.RegisterClassDemo;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class ExtendReportTest2 {
	WebDriver driver;
	ExtentSparkReporter htmlreport;
	ExtentReports report;
	Properties prop;
	//configure properties files kaaga this line
	FileInputStream file;
	//3 page class umcall pannikirom 
	HomePageclass hp;
	RegisterClassDemo rp;
	LoginPageclass lp;
	ExtentTest test;
  @Test
  public void RegisterScene() {
	      test = report.createTest("RegisterScene");
	      driver.get("http://demowebshop.tricentis.com/");
		    driver.findElement(By.linkText("Register")).click();
		    driver.findElement(By.id("gender-female")).click();
		    driver.findElement(By.id("FirstName")).sendKeys("GandhiGeerthana");
		    driver.findElement(By.name("LastName")).sendKeys("Manoharan");
		    driver.findElement(By.id("Email")).sendKeys("lifeiseasy123@gmail.com");
		    driver.findElement(By.name("Password")).sendKeys("Manoharan");
		    driver.findElement(By.name("ConfirmPassword")).sendKeys("Manoharan");
		    driver.findElement(By.id("register-button")).click();
	      
	      if(driver.findElement(By.linkText("Log out")).isDisplayed()){
	          test.log(Status.PASS, "Register Success");

	      }else{
	          test.log(Status.FAIL, "Register Unsucess");
	      }
	  }
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  htmlreport =new ExtentSparkReporter("C:\\selenium\\data\\report.html");
	  report=new ExtentReports();
	  report.attachReporter(htmlreport);
	  htmlreport.config().setTheme(Theme.DARK);
	  file=new FileInputStream(new File("C:\\Users\\manoh\\eclipse-workspace\\NewMavenDemo\\src\\test\\java\\TestNG_Practice\\config.properties"));
		prop=new Properties();
		prop.load(file);
		//properties file la irundhu firefox location eduku
	  System.setProperty("webdriver.gecko.driver",prop.getProperty("FirefoxDriver")); 
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open application using configur properties file la url ah get pani pandro
		driver.get(prop.getProperty("webshopurl"));
		//andha classes ah call panikidhu
		hp=new HomePageclass(driver);
		rp=new 	RegisterClassDemo(driver);
		lp=PageFactory.initElements(driver, LoginPageclass.class);
  }

  @AfterTest
  public void afterTest() {
	  report.flush();
	  driver.close();
  }

}
