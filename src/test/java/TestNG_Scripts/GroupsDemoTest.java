package TestNG_Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="user-registration") //All the test case will run which are present in this group 
public class GroupsDemoTest {
	
	@BeforeClass
	public void RunBeforeTestCase()
	{
		System.out.println("Launching Chrome Browser and Opening Application URL");
	}
	@AfterClass
	public void RunAfterTestCase()
	{
		System.out.println("Closing the Broswer");
	}
	
	
	
	@BeforeGroups(value="Regression")
	public void beforegroups()
	{
			System.out.println("Regression Test Case:- ");
	}
	
	
	@BeforeGroups(value="Smoke")
	public void beforegroups1()
	{

		System.out.println("Smoke Test Case:- ");
	}
	
	
	@Test(priority=2, groups= "Regression")
	public void VerifyLogin()
	{
		System.out.println("Login got Executed Successfully");
	}
	
	@Test(priority=1, groups="Regression")
	public void VerifyRegisteration()
	{
		System.out.println("Registeration got Executed Successfully");
	}
	
	@Test(priority=3,groups= {"Regression","Smoke"})
	public void HomePage()
	{
		System.out.println("HomePage got Executed Successfully");
	}
	
	@Test(priority=4, groups="Smoke")
	public void Payment()
	{
		System.out.println("Payment Done Successfully");
	}

}
