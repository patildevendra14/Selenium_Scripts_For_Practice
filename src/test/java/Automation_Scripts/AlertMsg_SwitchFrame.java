package Automation_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertMsg_SwitchFrame {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.manage().window().maximize();
	
	//switch to frame to find alert message
	WebElement frame1= driver.findElement(By.id("iframeResult"));
	driver.switchTo().frame(frame1);

	driver.findElement(By.xpath("/html/body/button")).click(); //xpath of "Try it"Button  
	
	//Please enter name in alert message
	driver.switchTo().alert().sendKeys("Devendra Patil");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();

	
	//to get title of 1st frame parentframe (Page title)
	driver.switchTo().parentFrame();
	System.out.println(driver.getTitle());
	//driver.close();
	}

}
