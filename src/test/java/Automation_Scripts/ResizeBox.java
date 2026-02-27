package Automation_Scripts;

import java.awt.SystemColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ResizeBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
	
		//Resize in frame so 1st we need to identify frame
		WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	    driver.switchTo().frame(frame);
	    
	    WebElement resize= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
	   Actions action =new Actions(driver);
	   action.dragAndDropBy(resize, 300 , 100);
	
		
	
        
	}

}
