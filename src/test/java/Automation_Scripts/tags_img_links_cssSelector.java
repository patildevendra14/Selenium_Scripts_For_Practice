package Automation_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tags_img_links_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
			
		//1) CSS-tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
                                    //or
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//2) CSS- tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Samsung");
		                                 //OR
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Samsung");
		
		//3) CSS- tag[attribute="value"]
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirts");
		                                //OR
	        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Apple Mobile");
		
		//4) CSS- tag class attribute  tsg.classname[attribute="value"];
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Jeans");
	
		//driver.findElement(By.id("small-searchterms")).sendKeys("Black Jeans");
		
		//driver.findElement(By.linkText("computers")).click();
	}

}
