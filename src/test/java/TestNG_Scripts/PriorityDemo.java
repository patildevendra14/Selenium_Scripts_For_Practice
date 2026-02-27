package TestNG_Scripts;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test (priority=1)
	public void testRegistration() {
		
		System.out.println("Registration Page got executed");
		
	}
	@Test(priority=2)
	public void LoginPge() {
		System.out.println("Login Page got exected ");
		
	}
	@Test(priority=3)
	public void HomePage() {
		System.out.println("HomePage got executed");
	}

}
