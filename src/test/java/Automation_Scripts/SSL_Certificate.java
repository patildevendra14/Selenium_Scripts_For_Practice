package Automation_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificate {
	public static void main (String[]args) throws InterruptedException {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		ChromeOptions options= new ChromeOptions();
		options.merge(dc);
		
		     //OR
		
		//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		//dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		//options.merge(dc);
		

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://expired.badssl.com");
		
	}

}
