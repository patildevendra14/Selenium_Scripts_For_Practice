package TestNG_Scripts;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common.BaseClass;

public class TestNGListener extends BaseClass{
	
	@Test(retryAnalyzer= Common.Retry.class)
	public void LaunchApp()
	{
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		Assert.assertTrue(true);
	}

}
