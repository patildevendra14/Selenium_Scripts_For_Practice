package TestNG_Scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	@Test
	void testLogin() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		
		//Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//click on Login button
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
	}

}
