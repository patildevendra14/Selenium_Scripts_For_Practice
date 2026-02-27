package TestNG_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Demo {

	// ---------Assert Equal-----------
	@Test
	public void AssertEqual() {

		Assert.assertEquals(9, 5); // Fail
		// 9:- is actual result found 5:- is expected result
	}

	@Test
	public void Assert1 ()
	{
		Assert.assertEquals(9, 9);  //Pass
	}
	
	//---------Assert True----------- 
	@Test
	public void AssetTrue() {
		
	int a=5, b=10;
	Assert.assertTrue(a<b);
	}
	
	//---------Assert Not Equal----------- 
	@Test
	public void AssertNotEqual() {
		
	
		Assert.assertNotEquals("Bye", "Bye"); //Fail because it is equal
	}
	
	//---------Assert False----------- 
	@Test
	public void AssertFalse() {
		
		int a= 10, b=50;
		Assert.assertFalse(a>b);
	
	}
	//---------Assert Fail----------- 
	@Test
	public void AssertFail() {
		int age=10;
		if(age<18)
		{
			Assert.fail("Age cannot be less than 18");
		}
	}
	
}
