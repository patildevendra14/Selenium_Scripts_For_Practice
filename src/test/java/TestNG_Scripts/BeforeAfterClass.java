package TestNG_Scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	
    
     @BeforeMethod
     public void setup()
     {
    	 System.out.println("Launching Chrome Browser and Opening Application URL");
     }
     @AfterMethod
     public void Clouser()
     {
    	 System.out.println("Closing Browser");
     }
     @Test(priority=1)
     public void RegisterationPage() 
     {
    	 System.out.println("Registeration Test Executed Successfully");
     }
     @Test(priority=2)
     public void LoginTest()
     {
    	 System.out.println("Login Page Executed Successfully");
     }
     @Test(priority=3)
     public void HomePageTest()
     {
    	 System.out.println("Home Page Executed Successfully");
     }
     
}
