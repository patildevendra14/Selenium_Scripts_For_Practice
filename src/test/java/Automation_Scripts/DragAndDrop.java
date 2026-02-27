package Automation_Scripts;

import java.awt.SystemColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	
		//drag nd drop is in frame so 1st we need to identify frame
		  WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		  driver.switchTo().frame(frame);
		  
		  WebElement drag= driver.findElement(By.id("draggable"));
		  WebElement drop= driver.findElement(By.id("droppable"));
	
      Actions action= new Actions(driver);
	  action.dragAndDrop(drag, drop).perform();
	
		
	 // Actions actions= new Actions(driver);
	 // actions.dragAndDrop(drag, drop).perform();
        
	}

}
