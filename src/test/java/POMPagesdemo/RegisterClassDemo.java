package POMPagesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterClassDemo {
WebDriver driver;

public RegisterClassDemo(WebDriver driver)
{
	this.driver=driver;
}
//	/locators
	By male=By.id("gender-male");
	By female=By.id("gender-female");
	By fn=By.id("FirstName");
	By ln=By.id("LastName");
	By email=By.id("Email");
	By password=By.id("Password");
	By againpass=By.id("ConfirmPassword");
	By clickregister=By.id("register-button");

public void Perform_register_female(String fname,String lname,String mail,String pword,String apword) {
	driver.findElement(female).click();
	driver.findElement(fn).sendKeys(fname);
	driver.findElement(ln).sendKeys(lname);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(password).sendKeys(pword);
	driver.findElement(againpass).sendKeys(apword);
	driver.findElement(clickregister).click();
	
}

}
