package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenerio7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(10000);
	    WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu']/li[2]/a"));
	    WebElement accessories=driver.findElement(By.xpath("//ul[@class='sublist firstLevel']/li[3]/a"));
	    Actions act=new Actions(driver);
	    act.moveToElement(computer).moveToElement(accessories).click().build().perform();	    
	    driver.close();
	}

}
