package Automation_Scripts;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestionDropdown {

	/*1) Open Makemytrip URL
	  2) Click on "From" dropdown in page
	  3 Enter/type "Mumbai" in dropdown it will show auto suggestion
	  4 Select 1st auto suggestion by using Keyboard key*/


	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		//1
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//2
		driver.findElement(By.xpath("//span[text()='From']")).click();
	   
		//3 and 4
	    //driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
	    //driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
	    //driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		     //Or we can write in simple way that
		WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
		   from.sendKeys("Mumbai");
		   Thread.sleep(2000);
	       from.sendKeys(Keys.ARROW_DOWN);
	       Thread.sleep(2000);
	       from.sendKeys(Keys.ENTER);
	       Thread.sleep(2000);
	}

}
