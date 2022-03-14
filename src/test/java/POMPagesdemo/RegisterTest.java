package POMPagesdemo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class RegisterTest {
	WebDriver driver;
	Properties prop;
	FileInputStream file;
	//rendu page class umcall pannikirom 
	HomePageclass hp;
	RegisterClassDemo rp;
	LoginPageclass lp;
  @BeforeClass
  public void beforeClass() throws IOException {
	  //config.properties mfile ah use panna idhu create pandro
	  file=new FileInputStream(new File("C:\\Users\\manoh\\eclipse-workspace\\NewMavenDemo\\src\\test\\java\\TestNG_Practice\\config.properties"));
		prop=new Properties();
		prop.load(file);
	  System.out.println("Pre-requisite");
	  //through config.properties file 
	  System.setProperty("webdriver.gecko.driver",prop.getProperty("FirefoxDriver")); 
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open application using configur properties file la url ah get pani pandro
		driver.get(prop.getProperty("webshopurl"));
		//oru oru page um thaniya create pani vachurukom namaku enga enga thevia padutho use panikalam indha mari object create panni top la hp nu la panirukom adhuvum apnnanu
		hp=new HomePageclass(driver);
		rp=new 	RegisterClassDemo(driver);
		//locators type different ah kuduthu irukom and idha nama normal class la dha create panirukom testng class ila
		lp=PageFactory.initElements(driver, LoginPageclass.class);
  }
  @Test(priority = 1)
  public void Registeration() {
	  //homepageclass la dha home page la iruka register link ah click panna eludhi iruko anga irundhu call panikirom 
	  hp.click_register();
	  //register method call pandro and inputs run indha mari theva padra place la kuduthukirom instead of craeating it again and again
	  rp.Perform_register_female("Gandhi", "Geerthana", "manokaleesari@gmail.com", "kalees12@", "kalees12@");
		String actualresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		assertTrue(actualresult.contains("Your registration completed"));
	  hp.click_logout();
		
  }
  //first register aaganu then enaku login aaganu so i gave priority here
@Test(priority  =2)
public void Login()
{
	//top la local variable create pannanu and before class la page facotry  create pannanu
	hp.click_login();
	//mail id password pass pandro
	lp.perform_login("manokaleesari@gmail.com", "kalees12@");
}
  @AfterClass	
  
  public void afterClass() {
	  System.out.println("Post-Condition");
		driver.close();
  }

}
