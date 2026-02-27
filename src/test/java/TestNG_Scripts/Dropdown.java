package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	void testDropdown() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		WebElement ddrown = driver.findElement(By.name("input_8"));

		Select select = new Select(ddrown);

		select.selectByValue("level1");
		Thread.sleep(2000);

		select.selectByIndex(5);
		Thread.sleep(2000);
		select.selectByVisibleText("2,501 - 5,000 employees");

		driver.close();
	}
}
