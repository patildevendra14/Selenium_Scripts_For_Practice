package TestNG_Scripts;

import org.testng.annotations.Test;

public class ThrowAnException {

	
	@Test
	public void ThrowAnException() throws Exception {

		int age = 15;
		if (age < 18) {
			throw new Exception("Age cannot be less than 18");  //Test Script will fail
		}

	}

}
