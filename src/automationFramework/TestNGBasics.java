package automationFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	/*
@BeforeSuite---Setup System property
@BeforeTest---Launch Browser
@BeforeClass--Login to app

@BeforeMethod---Enter the url
@Test--Google Title Test.........Test1
@AfterMethod--Logout from app

@BeforeMethod---Enter the url
@Test--Google logo test---------Test2
@AfterMethod--Logout from app

@BeforeMethod---Enter the url
@Test--Search test-----------------Test3
@AfterMethod--Logout from app

@AfterClass--Close Browser
@AfterTest--Delete all the cookies

PASSED: googletitletest
PASSED: logotest
PASSED: searchtest
	*/
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("@BeforeSuite---Setup System property");
	}
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("@BeforeTest---Launch Browser");
	}
	@BeforeClass
	public void login()
	{
		System.out.println("@BeforeClass--Login to app");
	}
	@BeforeMethod
	public void enterurl()
	{
		System.out.println("@BeforeMethod---Enter the url");
	}
	@Test(priority=1)
	public void googletitletest()
	{
		System.out.println("@Test--Google Title Test");
	}
	@Test(priority=2)
	public void searchtest()
	{
		System.out.println("@Test--Search test");
	}
	@Test(priority=3, enabled = false)
	public void logotest()
	{
		System.out.println("@Test--Google logo test");
	}
	@Test(priority=4)
	public void test1()
	{
		System.out.println("@Test--test1");
	}
	@Test(priority=5)
	public void test2()
	{
		System.out.println("@Test--test2");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("@AfterMethod--Logout from app");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("@AfterClass--Close Browser");
	}
	@AfterTest
	public void deletecookies()
	{
		System.out.println("@AfterTest--Delete all the cookies");
	}

}
