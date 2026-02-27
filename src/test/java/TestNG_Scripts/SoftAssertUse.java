package TestNG_Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {

	@Test
	public void VerifyTitile()
	{
		SoftAssert softassert= new SoftAssert();
		String expectedtitle = ("Electronics, Cars, Fashion, Collectibles & More | eBay");
		String expectedtext= "Search";
		//WebDriverManager.chromedriver().setup();		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com");
	    String actualtitle = driver.getTitle();
	    System.out.println("Verifying Title");
	    softassert.assertEquals(actualtitle, expectedtitle, "Title Verification Failed");
	    String actualtext= driver.findElement(By.xpath("//button[@id='gh-search-btn']")).getAttribute("value");
	    System.out.println("Verifying Text");
	    softassert.assertEquals(actualtext,expectedtext,"Text Verification Failed");
	    System.out.println("Closing Browser");
	    driver.close();
	    
	    softassert.assertAll();   /*by using assertAll fail assert will display, if you didn't user assertALL then fail test case will not show
		                           only passed test case will show.*/
	}
	
}
