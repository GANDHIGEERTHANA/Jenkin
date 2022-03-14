package LTI_DEMO;
//Scenario 2:
//	 
//1. open newtours app on chrome
//2. maximize the browser
//2. enter username as mercury
//3. enter password as mercury
//4. click on submit button
//5. click on flights link
//6. click on oneway
//7. select passengers from drop down
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenerio2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    //to maximise the browser
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/");
	    //how to work with ads
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    driver.findElement(By.name("submit")).click();
	    driver.findElement(By.linkText("Flights")).click();
	    //to avoid the ads page
	   /* if(driver.findElement(By.name("ad_iframe")).isDisplayed())
	    {
	    	WebElement frame=driver.findElement(By.name("ad_iframe"));
	    	driver.switchTo().frame(frame);
	    	driver.findElement(By.id("dismiss-button"));
	    	driver.switchTo().defaultContent();
	    } */	
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//input[@value='oneway']")).click();
	    //dropdown
	    Select drops =new Select(driver.findElement(By.name("passCount")));
	    drops.selectByIndex(1);
	    drops.selectByValue("4");
	    drops.selectByVisibleText("4");
	    //alternative way rather than above
//	    WebElement dropdown=driver.findElement(By.name("passCount"));
//	    Select drop=new Select (dropdown);
//	    drop.selectByIndex(1);
	    Select drop1=new Select(driver.findElement(By.name("fromPort")));
	    drop1.selectByIndex(3);
	    Select drop2=new Select(driver.findElement(By.name("fromMonth")));
	    drop2.selectByIndex(2);
	    Select drop3=new Select(driver.findElement(By.name("fromDay")));
	    drop3.selectByIndex(2);
	    Select drop4=new Select(driver.findElement(By.name("toPort")));
	    drop4.selectByIndex(4);
	    Select drop5=new Select(driver.findElement(By.name("toMonth")));
	    drop5.selectByIndex(4);
	    Select drop6=new Select(driver.findElement(By.name("toDay")));
	    drop6.selectByIndex(4);
	    driver.findElement(By.xpath("//input[@value='Business']")).click();
	    driver.findElement(By.name("findFlights")).click();
	}
}

