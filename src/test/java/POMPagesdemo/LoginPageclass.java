package POMPagesdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//normal class not an testng class
public class LoginPageclass {
WebDriver driver;
public LoginPageclass(WebDriver driver)
{
	this.driver=driver;
}
//locators eludhuro
@FindBy(name="Email")public WebElement email;
@FindBy(name="Password")public WebElement pword;
@FindBy(xpath="//input[@value='Log in']")public WebElement loginbutton;

//function ena pannanum sendkeys ah ila click ah comment pandro input register test ku la execute aaga poiru
public void perform_login(String uname,String paword)
{
	email.sendKeys(uname);
	pword.sendKeys(paword);
	loginbutton.click();
}
}
