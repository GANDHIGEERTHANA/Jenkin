package TestNG_Practice;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
	
public class ReadCSVfiledemo {
	WebDriver driver;
 @BeforeClass
 public void beforeClass() {
	 System.out.println("Pre-requisite");
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe"); 
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
}
	 
  @Test
  public void CSVReading() throws CsvValidationException, IOException {
	  //file location
	  CSVReader csvreader=new CSVReader(new FileReader("C:\\selenium\\data\\CSVFORMAT.csv"));
	  String[] csvcell;
	  while((csvcell=csvreader.readNext())!=null)
{
	String uname=csvcell[0];
	String Pword=csvcell[1];
	System.out.println("Username is: "+uname+"Password is: "+Pword);
	  driver.findElement(By.name("userName")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(Pword);
	 driver.findElement(By.name("submit")).click();
	 //namaku andha page dha poiruka check panna login ah title nu if else potu check pandro
	 if(driver.getTitle().contains("Login"))
	 {
		 System.out.println("Valid input");
		 //oruka credential work aachuna next data potu paaka mudiyadhu so sign off pandro
		 driver.findElement(By.linkText("SIGN-OFF")).click();
	 }
	 else
	 {
		 System.out.println("Invalid input");
	 }
}
  }
 

  @AfterClass
  public void afterClass() {
	  System.out.println("Post-Condition");
		driver.close();
  }

}
