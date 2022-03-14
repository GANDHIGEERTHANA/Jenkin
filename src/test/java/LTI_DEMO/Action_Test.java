package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.name("q")).sendKeys("Computer");
	    //for mouse and keyboard actions
	    Actions act=new Actions(driver);
	    act.moveToElement(driver.findElement(By.name("q")))
	    .pause(2000)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ARROW_DOWN)
	    .sendKeys(Keys.ENTER)
	    .build().perform();
	    
	    
	    driver.close();
//last build.perform is must
	    
	}

}
