package automationFramework;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchingIE {

	public static void main(String[] args) {
        //Path to the folder where you have extracted the IEDriverServer executable
		
		String service = "D:\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		InternetExplorerDriver  driver = new InternetExplorerDriver();        
		driver.get("http://yahoo.com");
		driver.close();
	}
}