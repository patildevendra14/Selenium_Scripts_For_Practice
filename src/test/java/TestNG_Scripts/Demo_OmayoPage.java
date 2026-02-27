package TestNG_Scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Demo_OmayoPage {
	
	@Test
	public void sampleautomationscript() throws InterruptedException {
 
	WebDriver driver = new ChromeDriver();
	driver.get("http://omayo.blogspot.com");
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Thread.sleep(2000);
	 driver.findElement(By.linkText("Selenium143")).click();
	 
	 driver.close();
	}	
}
