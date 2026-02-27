package TestNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	public void Assertion()
	{
		String actual_title="opencart";
		String expected_title="opencart1";
		
		Assert.assertEquals(actual_title, expected_title);   //Fail
				

		
	}
	@Test
	public void IntegerAssertion()
	{
		
		Assert.assertEquals(150, 150);    //Pass
	}
	
	
	
	
	
}
