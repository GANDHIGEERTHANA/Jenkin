package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    
	    //handle the alert
	    driver.findElement(By.xpath("//div[@id='OKTab']")).click();
	    driver.switchTo().alert().accept();
	    
	    //cancel the alert called confirm box
	    driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	    driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
	    driver.switchTo().alert().dismiss();
	    
	    //sendkeys handle prompt box
	    driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
	    driver.findElement(By.xpath("//div[@id='Textbox']")).click();
	    
	    //read alert
	    String text=driver.switchTo().alert().getText();
	    if(text.contains("Please enter your name"))
	    {
	    	driver.switchTo().alert().sendKeys("Hi I'm Keerthana");
	    	driver.switchTo().alert().accept();
	    	System.out.println("Process completed");
	    }
	    else
	    {
	    	System.out.println("Process  completed");
	    }
	    
	}
}
