package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	    //wait for 2 seconds explicity  for altert apperar on the screen
	    WebDriverWait wait=new WebDriverWait(driver, 2);
	    wait.until(ExpectedConditions.alertIsPresent());
	    driver.switchTo().alert().accept();
	    driver.close();
	    
	    
	}

}
