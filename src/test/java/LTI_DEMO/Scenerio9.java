package LTI_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenerio9 {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
    WebDriver driver = new FirefoxDriver(); 
    driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/test/newtours/");
    driver.findElement(By.linkText("Flights")).click();
    //wait for 20 seconds to locate theat oneway trip on screen--> means onw way screen la visbible aaguradhuku munadi namaku wait pannanu
    WebDriverWait wait=new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("tripType")));
    System.out.println("Completed");
}
}
