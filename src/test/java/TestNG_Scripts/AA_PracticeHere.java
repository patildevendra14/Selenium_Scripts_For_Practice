package TestNG_Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class AA_PracticeHere {

	@BeforeClass
	public void LunchingBrowserandURL() {

		System.out.println("Lunching Chrome Broswer & Opening URL");

	}

	@AfterClass
	public void ClosingBrowser() {
		System.out.println("Closing Browser");
	}
	
    @BeforeGroups(value="Regression")
	public void VerifyRegression()
	{
		System.out.println("Regression Test Case:-");
      
	}
	@BeforeGroups(value="Smoke")
	public void VerifySmoke()
	{
		System.out.println("Smoke Test Case:-");
	}
	
	@Test (priority=1, groups= {"Regression","Smoke"})
	public void VerifyRegistrationPage()
	{
	  System.out.println("Registration got Executed Successfully");	
	}
	
	@Test(priority=2, groups="Regression")
	public void VerifyLogin()
	{
		 System.out.println("Login got Executed Successfully");	
	}
	
	@Test(priority=3, groups="Smoke")
	public void VerifyHomePage()
	{
		 System.out.println("Homepage Open Successfully");	
	}
	
	@Test(priority=4, groups="Smoke")
	public void VerifyLogout()
	{
		 System.out.println("Logout Executed Successfully");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
