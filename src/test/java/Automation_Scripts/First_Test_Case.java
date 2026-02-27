package Automation_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*1)Lunch browser(chrome)
  2) Open URL("https://demo.opencart.com/")
  3) Validate title should be "Your Store"
  4) Close Browser*/

public class First_Test_Case {

	public static void main(String[] args) {
		
		//1)Lunch browser(chrome)
	    WebDriver driver=new ChromeDriver();             //Chrome Browser will open
		//WebDriver driver=new FirefoxDriver();         //Firefox Browser will open
		//ChromeDriver driver=new ChromeDriver();
		
		//2) Open URL
		driver.get("https://demo.opencart.com/");
		
		//3) Validate title should be "Your Store"
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
		//4) Close Browser
		//driver.close();
		driver.quit();
	}

}
