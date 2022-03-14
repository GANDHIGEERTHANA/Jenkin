package DEMO_Codility;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
public class one_testcase {
	WebDriver driver;
@Test
	public void TC01() {
	    WebElement searchbar= driver.findElement(By.name("q"));
	    WebElement searchicon=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
	    Assert.assertTrue(searchbar.isDisplayed());
	    Assert.assertTrue(searchicon.isDisplayed());
	}
@Test
public void TC02() {
	 WebElement searchbar= driver.findElement(By.name("q"));
	searchbar.sendKeys("testing");
	int list=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li")).size();
	Assert.assertTrue(list>1);
	
}
	@Test
	public void TC03()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		assertTrue(driver.getTitle().contains("Google"));
	}
	@Test
	public void TC04()
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
    driver.get("https://www.google.com");
	
}
@After
public void afterclass()
{
	driver.close();
}
}
