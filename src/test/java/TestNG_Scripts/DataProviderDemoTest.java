package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider="create")
	public void LoginPage (String username, String password) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@DataProvider(name="create")
	public Object[][] dataset()
	{
		return new Object[][]
		{
			{"standard_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"visual_user","secret_sauce"},
			//{"performance_glitch_user","secret_sauce"},
		};
	}
	

}
