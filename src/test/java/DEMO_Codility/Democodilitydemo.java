package DEMO_Codility;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Democodilitydemo {
	WebDriver webDriver;
	@Test
    public void TC1(){
        WebElement searchinput=webDriver.findElement(By.id("search-input"));
        WebElement submitbutton=webDriver.findElement(By.id("search-button"));
        assertTrue(searchinput.isDisplayed());
        assertTrue(submitbutton.isDisplayed());
    }  
    @Test
    public void TC2(){
        webDriver.findElement(By.id("search-button")).click();
        String err=webDriver.findElement(By.id("error-empty-query")).getText();
        assertEquals("Provide some query",err);
        assertTrue(err.contains("Provide some query"));
    }
     @Test
        public void TC3() throws InterruptedException{
            webDriver.findElement(By.id("search-input")).sendKeys("isla");
            webDriver.findElement(By.id("search-button")).click();
            Thread.sleep(300);
            int listsize=webDriver.findElements(By.xpath("//*[@id='search-results']/li")).size();
            assertTrue(listsize>1);
        }
        @Test
        public void TC4() throws InterruptedException{
            webDriver.findElement(By.id("search-input")).sendKeys("castle");
            webDriver.findElement(By.id("search-button")).click();
            Thread.sleep(300);
            String noresults=webDriver.findElement(By.id("error-no-results")).getText();
            assertTrue(noresults.contains("No results"));
        }
        @Test
        public void TC5() throws InterruptedException{
            webDriver.findElement(By.id("search-input")).sendKeys("port");
            webDriver.findElement(By.id("search-button")).click();
            Thread.sleep(300);
            int list=webDriver.findElements(By.xpath("//*[@id='search-results']/li")).size();
            assertTrue(list==1);
        } 
        @Before
        public void beforeclass()
        {
        	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
        	webDriver=new FirefoxDriver(); 
        	webDriver.manage().window().maximize();
        	webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	
        	//url want to change
        	webDriver.get("https://jmeter.apache.org/");
        	
        }
        @After
        public void afterclass()
        {
        	webDriver.close();
        }
        }



