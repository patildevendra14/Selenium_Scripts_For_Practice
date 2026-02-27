package Automation_Scripts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
	driver.manage().window().maximize();
	
	WebElement radio1 = driver.findElement(By.id("bookFlights"));
	WebElement radio2 = driver.findElement(By.id("redeemFlights"));
	
	radio2.click();
	System.out.println(radio1.isSelected());
	System.out.println(radio2.isSelected());
	
	System.out.println(driver.findElements(By.xpath("//input[@name='book-flight-radio']")).size());
    //driver.close();
   }

}
