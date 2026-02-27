package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassFour {
	
	@Parameters({"BrowserUrl"})
	@Test
	public void Class1(String BrowserUrl) {
		
		System.out.println("ClassFour got executed");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(BrowserUrl);
		driver.close();
	}
	
	@Parameters({"BrowserUrl"})
	@Test
	public void Class2(String BrowserUrl) {
		
		System.out.println("ClassFour got executed");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(BrowserUrl);
		driver.close();
	}
	
	@Parameters({"BrowserUrl"})
	@Test
	public void Class3(String BrowserUrl) {
		
		System.out.println("ClassFour got executed");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(BrowserUrl);
		driver.close();
	}

}
