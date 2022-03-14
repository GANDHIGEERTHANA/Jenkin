package DEMO_Codility;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class two_testcase {
	WebDriver driver;
	@Test
	public void TC01() {
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		System.out.println("Alert handled");
	}
	@Test
	public void TC02()
	{
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		Select drop1=new Select(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select")));
	    drop1.selectByVisibleText("3309");
	    driver.findElement(By.name("AccSubmit"));
		
	}
	@Test
	public void TC03()
	{
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		String title=driver.getTitle();
		Assert.assertEquals("Guru99 Bank Customer HomePage",title);
	}
	@Test
	public void TC04()
	{
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		if(driver.findElement(By.linkText("Home")).isDisplayed())
				{
			System.out.println("The link is there");
				}
		else
		{
			System.out.println("The link is not there");
		}
	}
	@Before
	public void beforeclass()
	{
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    driver=new FirefoxDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		
	}
	@After
	public void afterclass()
	{
		driver.close();
	}
	}
