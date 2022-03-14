package LTI_DEMO;

import java.io.*;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
	    WebDriver driver = new FirefoxDriver(); 
        driver.get("http://demowebshop.tricentis.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000)");
        //Take screenshot
        TakesScreenshot s=(TakesScreenshot)driver;
        File src = s.getScreenshotAs(OutputType.FILE);
        //Copy src file to local system
        File dest=new File("C:\\selenium\\data\\ScreenShot.jpg");
        FileUtils.copyFile(src,dest);
        Thread.sleep(2000);
        driver.close();
	}
}