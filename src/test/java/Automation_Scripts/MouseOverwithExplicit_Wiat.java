package Automation_Scripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverwithExplicit_Wiat {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement Electronic= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]"));
        //WebElement eDeal = driver.findElement(By.linkText("//*[text()='Electronics deals']"));
        
        Actions a= new Actions(driver);
        a.moveToElement(Electronic).perform();
        
        //a.moveToElement(eDeal).click(eDeal).build().perform();
        
        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"))).click();
        
	}

}
