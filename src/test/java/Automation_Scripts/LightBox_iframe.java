package Automation_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LightBox_iframe {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://omayo.blogspot.com/p/lightbox.html");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.id("lightbox1")).click();
	
	driver.findElement(By.xpath("//*[@class='close cursor']")).click();

	//driver.close();
	}

}
