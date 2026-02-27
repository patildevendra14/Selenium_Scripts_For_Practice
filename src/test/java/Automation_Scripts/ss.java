package Automation_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		
		WebElement iframe1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().sendKeys("Kunal");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}