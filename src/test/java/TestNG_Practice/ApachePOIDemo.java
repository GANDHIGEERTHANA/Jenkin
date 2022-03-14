package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ApachePOIDemo {
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
  public void Apachedemo() throws IOException {
	  //xl file oda location access pandradhuku
	  FileInputStream file=new FileInputStream("C:\\selenium\\data\\demo.xlsx");
	  //accesswing the workbook -->endha workbook kadnu pidika
	  XSSFWorkbook book=new XSSFWorkbook(file);
	//access worksheet-->endha sheet if we give 0 as index it defaulty take sheet1
	  XSSFSheet sheet= book.getSheetAt(0);
	  //access data-->indha mari loop panna last la iruka data vara check pannum
	  for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
	  {
		  //i kuduthe 1st row la edukum column namaku 0 for username
		  String uname= sheet.getRow(i).getCell(0).getStringCellValue();
		//i kuduthe 1st row la edukum column namaku 1 for password
		  String pword= sheet.getRow(i).getCell(1).getStringCellValue();
//		  username password print pani pakurom
		  System.out.println("Username is: "+uname+"Password is: "+pword);
		  driver.findElement(By.name("userName")).sendKeys(uname);
		  driver.findElement(By.name("password")).sendKeys(pword);
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
