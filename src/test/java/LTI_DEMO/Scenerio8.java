package LTI_DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//1. open https://demo.guru99.com/test/newtours/
//2. fetch special flights prices and display the data
//3. close appln
// 
//Note: use copy xpath option directly into your test script.
public class Scenerio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.navigate().to("https://demo.guru99.com/test/newtours/");
	    String flights = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]")).getText();
	    System.out.println("The data in the cell is: "+flights);
	    String price = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody")).getText();
	    System.out.println("The data in the cell is: "+price);
	    driver.close();
	    
	    
//	    or
//	    driver.manage().window().maximize();
//		List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr"));
//		System.out.println(rows.size());
//		
//		for (int i=1;i<=rows.size();i++) {
//			String specials=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[1]")).getText();
//			String price1=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr["+i+"]/td[2]")).getText();
//			System.out.println(specials +"--"+price1);
//			
//		}
//	}

}
	    
	}

