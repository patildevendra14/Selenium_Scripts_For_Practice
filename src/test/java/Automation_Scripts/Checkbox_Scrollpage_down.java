package Automation_Scripts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Checkbox_Scrollpage_down {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.sugarcrm.com/request-demo/");
	driver.manage().window().maximize();
	
	
	WebElement radio= driver.findElement(By.id("gform_submit_button_1"));
	Actions actions= new Actions(driver);
	actions.moveToElement(radio);
	actions.perform();
	
	driver.findElement(By.name("input_12.1")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("input_12.1")).click();
	Thread.sleep(2000);
	
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	driver.close();
	}

}
