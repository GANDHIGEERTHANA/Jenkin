package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenerio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.navigate().to("http://www.leafground.com/pages/Link.html");
	    driver.findElement(By.linkText("Verify am I broken?")).click();
	    String title=driver.getTitle();
	    if(title.contains("404")) {
	    	System.out.println("Link is broken");
	    }
	    else
	    {
	    	System.out.println("Link is not broken");
	    }
	    driver.close();
	}

}
