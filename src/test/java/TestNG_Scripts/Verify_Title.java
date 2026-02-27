package TestNG_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Title {
	
	@Test
	public void TestTitle() 
	{
		String expectedtitle= ("Electronics, Cars, Fashion, Collectibles & More | eBay");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String actualtitle= driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		
	}

}
