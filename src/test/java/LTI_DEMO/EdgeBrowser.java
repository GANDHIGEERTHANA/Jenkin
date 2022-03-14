package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System Property for Chrome Driver   
		System.setProperty("webdriver.edge.driver","C:\\selenium\\msedgedriver.exe");
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver = new EdgeDriver(); 
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");

}
}
