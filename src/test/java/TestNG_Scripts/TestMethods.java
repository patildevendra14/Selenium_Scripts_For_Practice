package TestNG_Scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMethods {

	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login from Application");
	}
	
	@AfterTest
	public void logoutfromApplication()
	{
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod()
	public void Connected_To_DB()
	{
		System.out.println("DB is Connected");
	}
	
	@AfterMethod()
	public void Disconnected_To_DB()
	{
		System.out.println("DB is Disconnected");
	}
	
	@Test(priority=1, description="This is Login Test Case")
	public void TestCase_1()
	{
		System.out.println("Login Test Case Executed Successfully");
	}
	
	@Test(priority=2, description="This is Logout Test Case")
	public void TestCase_2()
	{
		System.out.println("Logout Test Case Executed Successfully");
	}
	
}

