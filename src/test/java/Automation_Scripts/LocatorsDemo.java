package Automation_Scripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//1)name
		//driver.findElement(By.name("search")).sendKeys("Moblie");
		
		//2) id
		//boolean logoDisplays=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplays);
		
		//3)linktext
		//driver.findElement(By.linkText("Tablets")).click();
		
		//To find links
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total No. of HeaderLinks:"+headerLinks.size());
		
		//To find total links in webpage
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total No. of Links:"+links.size());
		
		
	}
	

}
