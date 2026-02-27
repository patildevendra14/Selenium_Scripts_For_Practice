package Automation_Scripts;

import java.awt.SystemColor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		
		//Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//click on Login button
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='inventory_item_img']")).click();
		Thread.sleep(2000);

	    
		//driver.close();		
		
		
		
		
		
	
        
	}

}
