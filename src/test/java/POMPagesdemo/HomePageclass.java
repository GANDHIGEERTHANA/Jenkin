package POMPagesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageclass {
		WebDriver driver;
		public HomePageclass(WebDriver driver)
		{
			this.driver=driver;
		}
//		/locators
		By registerlink=By.linkText("Register");
		By loginlink=By.linkText("Log in");
		By searchfield=By.name("q");
		By searchbutton=By.xpath("//input[@value='Search']");
		By logout=By.linkText("Log out");
		
		//methods
		public void click_login()
		{
			driver.findElement(loginlink).click();
		}
		public void click_register()
		{
			driver.findElement(registerlink).click();
		}
		public void click_logout()
		{
			driver.findElement(logout).click();
		}
public void Search_product(String pname)
{
	driver.findElement(searchfield).sendKeys(pname);
	driver.findElement(searchbutton).click();
}

	}

	
