package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class scenerio2 {
 @BeforeTest//works before the test 
	  public void beforeTest() {
		 System.out.println("Before test is working here");
	  }
 @BeforeClass//execute once before every class 
	  public void beforeClass() {
		System.out.println("Before class is working here");
	  }
  @BeforeMethod//execute for every methods
  public void beforeMethod() {
	  System.out.println("Before method is working here");
  }
  @Test//every method or every test case must have the @test annotation
  public void Testcase1() {
	  System.out.println("This is my first testcase1");
  }
  @Test//every method or every test case must have the @test annotation
  public void Testcase2() {
	  System.out.println("This is my second testcase2");
  }
  @AfterMethod//execute for every methods
  public void afterMethod() {
	  System.out.println("After method is working here");

  }

  @AfterClass//execute once after every class
  public void afterClass(){
	  System.out.println("After class is working here");
  }
  @AfterTest//works after the test 
  public void afterTest() {
	  System.out.println("After test is working here");
  }

}
