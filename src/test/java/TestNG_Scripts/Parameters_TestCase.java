package TestNG_Scripts;

import java.awt.SystemColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_TestCase {
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test

	public void lunchAppliction(String browser) throws InterruptedException {
		
		if(browser.equals("chrome"))
		{
			 driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			 driver= new FirefoxDriver();
		}
		else if (browser.equals("edge"))
		{
		     driver= new EdgeDriver();
		}
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		
		//Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//click on Login button
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
		driver.close();		
		
		
		
		
		
	
        
	}

}
