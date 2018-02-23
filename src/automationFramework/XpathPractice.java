package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();			
		driver.get("http://freecrm.com/");
		//Xpath Practice (press ctrl+f for xpath in chrome)
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("manisha"); //textbox
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manisha"); //textbox
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click(); //btn type=submit
		driver.findElement(By.xpath("//button[@type='button' and @class='btn']"));//btn type=button
		driver.findElement(By.xpath("//a[text()='Features']"));//link
		driver.findElement(By.xpath("//a[contains(text(), 'Features')]"));//link
		

	}

}
