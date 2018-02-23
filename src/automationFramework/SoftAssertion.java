package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssertion {		
		WebDriver driver;		
		@BeforeMethod
		public void setUp(){				
			driver = new FirefoxDriver(); //launch chrome
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
		}

		@Test()
		public void googleTitleTest(){
			String title = driver.getTitle();
			System.out.println(title);
			//Assert.assertEquals(actual, expected);
			Assert.assertEquals(title, "Google123", "title is not matched");
		}

		@Test()
		public void googleLogoTest(){
			boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
			Assert.assertTrue(b);
			Assert.assertEquals(b, true);
		}

		@AfterMethod
		public void tearDown(){
			driver.quit();
		}

	}


