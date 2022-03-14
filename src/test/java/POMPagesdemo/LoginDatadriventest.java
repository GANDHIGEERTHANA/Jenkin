package POMPagesdemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

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
import org.testng.annotations.AfterClass;

public class LoginDatadriventest {
	WebDriver driver;
	//config properties file iruka data va access panna this line
	Properties prop;
	//configure properties files kaaga this line
	FileInputStream file;
	//3 page class umcall pannikirom 
	HomePageclass hp;
	RegisterClassDemo rp;
	LoginPageclass lp;
  @Test(dataProvider = "data")
  public void loginpomwithdataprovider(String email, String pword) {
	  hp.click_login();
	  lp.perform_login(email, pword);
	  //login aachu na then log out therinja log out aagidanu 
	  //valid data na login aagum so next data enter pandradhukaaga log out aaganu so if else kuduthurkom
	  if(driver.findElement(By.linkText("Log out")).isDisplayed())
	  {
		  System.out.println("Login success");
		  hp.click_logout();
	  }
	  else
	  {
		  System.out.println("Login unsuccess");
	  }
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "manokaleesari@gmail.com", "kalees12@" },
      //second data invalid ah kuduthu iruken so enaku failure dha aagum 
      new Object[] { "keerthu", "b" },
    };
  }
  @BeforeClass
  public void beforeClass() throws IOException {
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

  @AfterClass
  public void afterClass() {
	  System.out.println("Post-Condition");
		driver.close();
  }

}
