package Automation_Scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.salesforce.com/au/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"1728344622112_jo7\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
	
	//switch to other window
	Set <String> windowhandles= driver.getWindowHandles();
    System.out.println(windowhandles);
     
     Iterator<String> iterator = windowhandles.iterator();
     String parentwindow = iterator.next();
     String childwindow = iterator.next();
     
     driver.switchTo().window(childwindow);
     
     driver.findElement(By.name("email")).sendKeys("DevendraPatil"); 
     //driver.findElement(By.xpath("//*[@id='0abdc7b5-911e-46db-8ad1-5888c0b7118d']")).sendKeys("DevendraPatil");
     driver.findElement(By.name("password")).sendKeys("12Abc");
     Thread.sleep(4000);
     
     //click on create account button
     driver.findElement(By.xpath("//*[@id=\"workflow-login-page\"]/div/div[2]/div[2]/div/div[3]/a")).click();
     
     driver.switchTo().window(parentwindow); //again go on main page
	//driver.close();
	}

}
