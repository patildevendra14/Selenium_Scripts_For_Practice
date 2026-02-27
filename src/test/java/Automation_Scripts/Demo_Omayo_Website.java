package Automation_Scripts;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_Omayo_Website {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		//1] URL will open
		driver.get("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//2] Find element using linktext means text near link or text of link
	
		driver.findElement(By.linkText("Open a popup window")).click();
	
		//driver.findElement(By.linkText("Blogger")).click();
		
		/*3] Find text inside the textbox
		String text= driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(text);
		
		//4] Get / find label name
		String txt= driver.findElement(By.id("pah")).getText();
		System.out.println(txt);
		
		  //5] isDisplyed means True/False
		 boolean display = driver.findElement(By.id("but2")).isDisplayed();
		 System.out.println("Button is Displaying: "+display);
		 
		 boolean Enabled= driver.findElement(By.id("but2")).isEnabled();
		 System.out.println("Button is Enabled: "+Enabled);
		 
		 //6] all html code of page will display
		 //String pagecode= driver.getPageSource();
		 //System.out.println(pagecode);
		 
		 //7] Height and Width of button
		 Dimension d = driver.findElement(By.id("but2")).getSize();
		 System.out.println("Height of button is: "+d.height);
		 System.out.println("Width of button is: "+d.width);
		 
		 //8] Find X,Y coordinate of button ,means from top button at with place button is located
		  Point p = driver.findElement(By.id("but2")).getLocation();
		  System.out.println("X coordinate of button is: "+p.x);
		  System.out.println("Y coordinate of button is :"+p.y);*/
		  
		  Thread.sleep(2000);
		  //9] Open Window in fullscreen
		  //driver.manage().window().fullscreen();
		 
		 //10] Dropdown Functionality
		  driver.findElement(By.className("dropbtn")).click();
		  Thread.sleep(2000);
		  //11]Scroll Functionality
		  WebElement scroll= driver.findElement(By.id("footer-1"));
		  Actions action= new Actions(driver);
		  action.moveToElement(scroll).perform();
		  
		  
		  Thread.sleep(2000);
		 //12] Explicit Wait
		  WebDriverWait wait= new WebDriverWait(driver,	Duration.ofSeconds(30));
		  WebElement fbElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		  fbElement.click();
		 
		 
		//13] Quit us user to close all browser and all child window which are open
		driver.quit();
		
		
		
	}

}
  