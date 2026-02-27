package Automation_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchFrame {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	driver.manage().window().maximize();
	
	//switch to frame to find alert message
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("/html/body/button")).click(); //xpath of "Try it"Button  
	

	//driver.close();
	}

}
