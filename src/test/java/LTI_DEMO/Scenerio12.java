package LTI_DEMO;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Scenerio12 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");     
    WebDriver driver = new FirefoxDriver(); 
//Maximize the browser
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://demowebshop.tricentis.com/");
Thread.sleep(5000);
List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println("Total links are "+links.size());
for(int i=0; i<links.size(); i++) {
WebElement element = links.get(i);
//By using "href" attribute, we could get the url of the requried link
String url=element.getAttribute("href");
verifyLink(url);
}
}
public static void verifyLink(String urlLink) {
        try {
URL link = new URL(urlLink);
HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
httpConn.setConnectTimeout(2000);
httpConn.connect();
if(httpConn.getResponseCode()== 200) {
System.out.println(urlLink+" - "+httpConn.getResponseMessage());
}
if(httpConn.getResponseCode()== 404) {
System.out.println(urlLink+" - "+httpConn.getResponseMessage());
}
}
catch (Exception e) {
}
        
    }
}