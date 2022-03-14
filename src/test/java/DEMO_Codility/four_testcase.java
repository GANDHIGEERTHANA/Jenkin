package DEMO_Codility;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class four_testcase {
		WebDriver driver;

	@Test
	public void TC01()
	{
		int links = driver.findElements(By.tagName("a")).size();
		assertTrue(links>0);
		}

@Before
public void beforeclass()
{
	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
    driver=new FirefoxDriver(); 
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://jmeter.apache.org/");
	
}
@After
public void afterclass()
{
	driver.close();
}
}
