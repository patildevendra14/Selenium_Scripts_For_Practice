package Automation_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_MultipleOption {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement ddrown =driver.findElement(By.id("multi-select"));
		
	    Select select=new Select(ddrown);
	    select.selectByValue("Clifornia");
	    
	    select.selectByIndex(5);
        List <WebElement> alliteams= select.getAllSelectedOptions();
		System.out.println(alliteams.size());
		select.deselectAll();
		
		select.selectByIndex(5);
		
		select.deselectByIndex(5);
		
		List<WebElement> alliteams1= select.getAllSelectedOptions();
		System.out.println(alliteams1.size());
		
		//for default option
		WebElement firstoption= select.getFirstSelectedOption();
		System.out.println(firstoption);
		
		
	}

}
