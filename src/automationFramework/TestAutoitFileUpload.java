package automationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAutoitFileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Program%20Files%20%28x86%29/AutoIt3/fileupload.html");
		driver.findElement(By.xpath(".//*[@id='1']")).click();
	    Runtime.getRuntime().exec("C://Program Files (x86)//AutoIt3//fileupload.exe");
		Thread.sleep(5000);
		driver.close();
	}

}
