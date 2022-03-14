package LTI_DEMO;
//Scenario 4:
//	 
//1. open https://demo.guru99.com/test/drag_drop.html
//2. drag BANK and drop it on DEBIT SIDE ACCOUNT
//3. drag 5000 and drop it on DEBIT SIDE ACCOUNT
//4. drag SALES and drop it on CREDIT SIDE ACCOUNT
//5. drag 5000 and drop it onCREDIT SIDE ACCOUNT
//6. close
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenerio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act= new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("credit2")),
		driver.findElement(By.id("bank"))).build().perform();
		act.dragAndDrop(driver.findElement(By.id("fourth")), 
		driver.findElement(By.id("amt7"))).build().perform();
		act.dragAndDrop(driver.findElement(By.id("credit1")), 
		driver.findElement(By.id("loan"))).build().perform();
		act.dragAndDrop(driver.findElement(By.id("fourth")), 
		driver.findElement(By.id("amt8")))
		.build().perform();
	
		
		
		
//				act.dragAndDrop(driver.findElement(By.xpath("//li[@id='credit2']")),
//				driver.findElement(By.xpath("//*[@id='amt7']"))).build().perform();
//				act.dragAndDrop(driver.findElement(By.xpath("//li[@data-id='2']")), 
//				driver.findElement(By.xpath("//*[@id='amt7']"))).build().perform();
//				act.dragAndDrop(driver.findElement(By.xpath("//li[@id='credit1']")), 
//				driver.findElement(By.xpath("//ol[@id='amt8']"))).build().perform();
//				act.dragAndDrop(driver.findElement(By.xpath("//li[@data-id='2']")), 
//				driver.findElement(By.xpath("//ol[@id='amt8']")))
//				.build().perform();

		
	}

}
