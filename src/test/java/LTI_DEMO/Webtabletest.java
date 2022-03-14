package LTI_DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtabletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    //opening the application
	    driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
	    //fetch no of columns
//	    th[1] na first heading cell ah mention pannum adhei th na andha top elamei mention aagum
//	    thead-->table oda topic ah thead soluvom tr-->row ah soluvom adhukula iruka values elamei -->th la varum
	    List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	    System.out.println("The size of the column is: "+col.size());
	    //fetching no. of rows
//	    heading na thead adhuku keela iruka ela column um tbody, then tr-->andh row mention pannum if we want to specify specific row means tr[1] like that
//	    when we are getting list of data want to implement the list of webelement
	    List<WebElement> Rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
	    System.out.println("The size of the rows is: "+Rows.size());
	    //fetching specific cell data
//	    td--> single cell oda detail ah edukurathuku
	    String celldata = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
	    System.out.println("The data in the cell is: "+celldata);
	    //equal panni paaakumodhu unique it means static ah iruka data va dha equal pani paakanu ilana test failed top company have a grade always thats why we used like this
	    if(celldata.equals("A")){
	    	System.out.println("The value is correct");
	    }
	    else
	    {
	    	System.out.println("The data is incorrect or mismatch");
	    }
	    //checking the company top data
//	    andha first cell value ah edutha podhu top company ena therinjurum. every time it change so the value because it is dynamic table
	    String topcompany = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
	    System.out.println("The data in the cell is: "+topcompany);
	    //getting top 5 company list
//	    path kula"+i+" tharom because namaku top 5 company venum so oru oru row oda 1st cell value edutha andha top 5 company therinjurum so tr row oda count 1-5 iterate panitu and row oda 1st cell value ah print panirukom
	    for(int i=1;i<=5;i++)
	    {
	    String top5 = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
	    System.out.println(top5);
	    }
	    driver.close();
	
	}

}
