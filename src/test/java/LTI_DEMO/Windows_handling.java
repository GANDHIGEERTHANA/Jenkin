package LTI_DEMO;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("http://demo.guru99.com/popup.php");
	    //opening  page oda window id stored in the  old page  as value
	    String oldpage=driver.getWindowHandle();
	    System.out.println("The old window id name is "+oldpage);
	    
	    //clicking the link to get the new window
	    driver.findElement(By.linkText("Click Here")).click();
	    //switch from old window to new window
	    //to get window id  of newly opened tab, use below syntax
	    //for new page we have to give the set it defaultly ask
	    Set<String> newpage=driver.getWindowHandles();
        for(String name:newpage){
            driver.switchTo().window(name);
            System.out.println("widow id of newly opened tab is :"+name);
        }
        Thread.sleep(10000);
	    //in new window the control changed and the enter email id field
	    driver.findElement(By.name("emailid")).sendKeys("manohar@gmail.com");
	    //click
	    driver.findElement(By.name("btnLogin")).click();
	    
	    //switch to old window 
	    driver.switchTo().window(oldpage);
	    driver.quit();
	    }

}
