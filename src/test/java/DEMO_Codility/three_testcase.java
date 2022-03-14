package DEMO_Codility;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class three_testcase {
	WebDriver driver;
	@Test
	public void TC01()
	{
	driver.findElement(By.xpath("/html/body/div[3]/a")).click();
	Select drop1=new Select(driver.findElement(By.name("title")));
    drop1.selectByIndex(2);
    driver.findElement(By.name("firstname")).sendKeys("GandhiGeerthana");
    driver.findElement(By.name("lastname")).sendKeys("Manoharan");
    driver.findElement(By.name("phone")).sendKeys("7449187760");
    Select drop2=new Select(driver.findElement(By.name("year")));
    drop2.selectByValue("1993");
    Select drop3=new Select(driver.findElement(By.name("month")));
    drop3.selectByValue("12");
    Select drop4=new Select(driver.findElement(By.name("date")));
    drop4.selectByVisibleText("14");
    driver.findElement(By.id("licencetype_f")).click();
    Select drop5=new Select(driver.findElement(By.name("licenceperiod")));
    drop5.selectByIndex(1);
    Select drop6=new Select(driver.findElement(By.name("occupation")));
    drop6.selectByIndex(5);
    driver.findElement(By.name("street")).sendKeys("44/30,market street");
    driver.findElement(By.name("city")).sendKeys("tirmangalam");
    driver.findElement(By.name("county")).sendKeys("India");
    driver.findElement(By.name("post_code")).sendKeys("625706");
    driver.findElement(By.name("email")).sendKeys("mano@gmail.com");
    driver.findElement(By.name("password")).sendKeys("Kalees12@");
    driver.findElement(By.name("c_password")).sendKeys("Kalees12@");
    driver.findElement(By.name("submit")).click();

    
	}

	@Before
	public void beforeclass()
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    driver=new FirefoxDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
	}
	@After
	public void afterclass()
	{
		driver.close();
	}
	}

