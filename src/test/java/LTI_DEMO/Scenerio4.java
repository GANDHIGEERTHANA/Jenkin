package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Scenario 4:
	 
1. open demo web shop page on any browser
2. Perform login
3. Type "Build your own cheap computer" in searchbox
4. Click Fast processor
5. Click 8 GM RAM
6. Click 400 GB HDD
7. Check Image Viever, Office suite, Other office suite
8. Click add to cart*/
public class Scenerio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.partialLinkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("manoharange@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("Manoharan");
	    driver.findElement(By.xpath("//input[@type='submit']/parent::div")).click();
	    driver.findElement(By.name("q")).sendKeys("Cheap Computer");
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	    driver.findElement(By.linkText("Build your own cheap computer")).click();
	    driver.findElement(By.id("product_attribute_72_5_18_65")).click();
	    driver.findElement(By.id("product_attribute_72_6_19_91")).click();
	    driver.findElement(By.id("product_attribute_72_3_20_58")).click();
	    driver.findElement(By.id("product_attribute_72_8_30_93")).click();
	    driver.findElement(By.id("product_attribute_72_8_30_94")).click();
	    driver.findElement(By.id("product_attribute_72_8_30_95")).click();
	    driver.findElement(By.id("add-to-cart-button-72")).click();
	    driver.findElement(By.partialLinkText("Shopping")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Qty.:')]/following::input[1]")).clear();
	    driver.findElement(By.xpath("//span[contains(text(),'Qty.:')]/following::input[1]")).sendKeys("0");
	    driver.findElement(By.name("updatecart")).click();
	    driver.findElement(By.partialLinkText("Log ")).click();

	
	}

}
