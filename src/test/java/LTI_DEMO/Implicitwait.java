package LTI_DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    //want to give before the url and the implicit wait it will wait wherever we meeting the exceptions throuout the code 
	    //and it will like this want to give time first and after time unitwe have to give the days,months tooo
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //opening the application
	    driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
	    for(int i=1;i<=5;i++)
	    {
	    String top5 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
	    System.out.println(top5);
	    }
	    driver.close();
	}

}
