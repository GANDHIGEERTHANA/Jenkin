package LTI_DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenerio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.navigate().to("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("The number of links ind the website is: "+links.size());
	    driver.close();
	}

}
