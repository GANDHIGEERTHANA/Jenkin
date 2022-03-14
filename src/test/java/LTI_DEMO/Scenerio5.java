package LTI_DEMO;
//1. Open amazon.in
//2. search for samsung and choose samsung mobile using keyboard events
//3. close

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenerio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.name("field-keywords")).sendKeys("Samsung mobile");
	    //for mouse and keyboard actions
	    Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.name("field-keywords")))
	    .pause(2000)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_UP)
	    .sendKeys(Keys.ENTER)
	    .build().perform();
	    
	    
	    driver.close();
	}

}
