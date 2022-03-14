package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless {
  @Test
  public void f() {
//	  FirefoxOptions ffoption= new FirefoxOptions();
//		ffoption.addArguments("headless");
//		//headless test excution
//		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
//		FirefoxDriver driver = new FirefoxDriver(ffoption); 
//	    driver.get("http://demowebshop.tricentis.com/");
//	    System.out.println(driver.getTitle());
//	    driver.close();
	    
	    
	    
	    HtmlUnitDriver htmlDriver=new HtmlUnitDriver();
        htmlDriver.get("https://www.google.com");
        System.out.println(htmlDriver.getTitle());
        htmlDriver.close();
  }
}
