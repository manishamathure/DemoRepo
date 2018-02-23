package automationFramework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String exePath = "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();		
		driver.get("facebook.com");
		driver.close();
	}

}
