package LTI_DEMO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("http://demowebshop.tricentis.com/");
	    //get the title
	    String title=driver.getTitle();
	    System.out.println("Title is "+title);
	    //checking crt or wrong
	    if(title.equals("Demo Web Shop"))
	    {
	    	System.out.println("True");
	    }
//	    checking the url of current page
	    String url=driver.getCurrentUrl();
	    System.out.println("The url of this page is "+url);
	    //get all the inspected area codes html
	    String page=driver.getPageSource();
	    System.out.println("The page source is "+page);
	    
	    //navigate function
	    //moving backword
	    driver.navigate().back();
	    //moving forward button
	    driver.navigate().forward();
	    //refresh the page
	    driver.navigate().refresh();
	    //getting that url
	    driver.navigate().to("http://demo.guru99.com/popup.php");
	    
	}

}
