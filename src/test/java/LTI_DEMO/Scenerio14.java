package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenerio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.navigate().to("http://www.leafground.com/pages/Image.html");
	    WebElement brokenimage= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
	    if(brokenimage.getAttribute("natural width").equals("0"))
	    {
	    	System.out.println("Im broken image");
	    }
	    else
	    {
	    	System.out.println("Im not broken image");
	    }
	    driver.close();
	}

}
