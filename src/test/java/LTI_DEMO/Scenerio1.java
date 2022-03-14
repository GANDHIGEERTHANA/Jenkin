package LTI_DEMO;


//1.Open http://demowebshop.tricentis.com/ on any browser
//2. click on Register
//3. Click on Gender - Female
//4. Enter firstname
//5. Enter lastname
//6. Enter Email
//7. Enter password
//8. Enter confirm password
//9. Click on Register

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenerio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Register")).click();
//	    driver.findElement(By.partialLinkText("Regist")).click();
	    driver.findElement(By.id("gender-female")).click();
//	    driver.findElement(By.xpath("//label[contains (text(),'Female')]")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("GandhiGeerthana");
	    driver.findElement(By.name("LastName")).sendKeys("Manoharan");
	    driver.findElement(By.id("Email")).sendKeys("manoharangeer@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("Manoharan");
	    driver.findElement(By.name("ConfirmPassword")).sendKeys("Manoharan");
//	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("hi12@@");
//	    driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("hi12@@");
	    driver.findElement(By.id("register-button")).click();
//	    driver.findElement(By.partialLinkText("Log o")).click();
	}

}
