package LTI_DEMO;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class JunitExercise1 {
	WebDriver driver;
	@Test
	public void Testcase1() {
		System.out.println("Test case 1");
		//to maximise the browsser
				driver.manage().window().maximize();
				//enter username
				driver.findElement(By.name("userName")).sendKeys("mercury");
				//enter password
				driver.findElement(By.name("password")).sendKeys("mercury");
				//click on submit
				driver.findElement(By.name("submit")).click();	
				//check whether ogin is success
				String actualresult=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
				Assert.assertEquals("Login Successfully",actualresult);
				
	}
	@Test
		public void Testcase2() throws InterruptedException {
			System.out.println("flights search");
			driver.findElement(By.linkText("Flights")).click();
			Thread.sleep(5000);
			//check whether title of webpage id find a flight: Mercury Tours:
//			String title=driver.getTitle();
//			Assert.assertEquals("Find a Flight: Mercury Tours: ",title);
			//click on oneway
			driver.findElement(By.xpath("//input[@value='oneway']")).click();
			//select passenger value from dropdown
			Select p=new Select(driver.findElement(By.name("passCount")));
			p.selectByIndex(3);
			Select p1=new Select(driver.findElement(By.name("fromPort")));
			p1.selectByVisibleText("London");
			Select p2=new Select(driver.findElement(By.name("fromMonth")));
			p2.selectByVisibleText("July");
			Select p3=new Select(driver.findElement(By.name("fromDay")));
			p3.selectByIndex(22);
			Select p4=new Select(driver.findElement(By.name("toPort")));
			p4.selectByVisibleText("New York");
			Select p5=new Select(driver.findElement(By.name("toMonth")));
			p5.selectByVisibleText("July");
			Select p6=new Select(driver.findElement(By.name("toDay")));
			p6.selectByIndex(28);
			driver.findElement(By.xpath("//input[@value='Business']")).click();
			Select p7=new Select(driver.findElement(By.name("airline")));
			p7.selectByVisibleText("Blue Skies Airlines");
			driver.findElement(By.name("findFlights")).click();
//		String actualresult=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]/text()")).getText();
//		Assert.assertEquals("After flight finder - No Seats Avaialble",actualresult);
	}
	@Before
	public void before() {
		System.out.println("Pre-requisite");
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe"); 
		driver=new FirefoxDriver();
		//open application
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	@After
	public void after() {
		System.out.println("Post-Condition");
		driver.close();
	}
}