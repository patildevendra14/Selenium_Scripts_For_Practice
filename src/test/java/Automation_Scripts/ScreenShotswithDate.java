package Automation_Scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotswithDate {

	public static void main(String[] args) throws IOException {
		
		 Date currentdate= new Date();
		 System.out.println(currentdate);
		 
	     //String ssfilename= currentdate.toString().replace(" ", "-").replace(":", "-");
	     //System.out.println(ssfilename);
	    		 
	    WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//FileUtils.copyFile(screenshotFile,new File(".//screenshot//+ssfilename+.png"));
		FileUtils.copyFile(screenshotFile,new File(".//screenshot//.png"));
		driver.close();
	}

}
