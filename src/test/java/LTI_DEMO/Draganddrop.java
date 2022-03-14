package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
	    driver.get("https://jqueryui.com/droppable/");
	    driver.findElement(By.linkText("Droppable"));
	    //for mouse and keyboard actions
	   //nama control ah oru frame ku eduthutu porom because drag and drop oru frame kula iruku so control ah switch pandrom
    	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	   //mouse action kaaga drag and drop use panirukom before , source location tharanu after , destination location tharanu
    	 Actions act=new Actions(driver);
    	act.dragAndDrop(driver.findElement(By.id("draggable")),
			   driver.findElement(By.id("droppable"))).build().perform();
	}

}
