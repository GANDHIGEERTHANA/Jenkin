package TestNG_Practice;

import org.testng.annotations.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Date_Provider_Check {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Pre-requisite");
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe"); 
			driver=new FirefoxDriver();
			//open application
			driver.get("https://demo.guru99.com/test/newtours/");
	  }
  @Test(dataProvider = "dataproviderdemo")
  public void checking(String name, String password) {
	  //instead of hard coading nama inga pass pandro data provider moolama meal parameter iruku data provide panirukadhu keela iruku
	  System.out.println("Username is: "+name+"Password is: "+password);
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
  }
  @AfterMethod
  public void afterTest() {
	  System.out.println("Post-Condition");
		driver.close();
  }
  @DataProvider
  public Object[][] dataproviderdemo() {
    return new Object[][] {
      new Object[] { "mercury", "mercury" },
      new Object[] { "", "mercury" },
      new Object[] { "mercury", "" },
      new Object[] { "m", "m" },
      new Object[] { "", "" },
      
    };
    
  }
}
