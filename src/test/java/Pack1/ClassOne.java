package Pack1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {

	@BeforeTest
	public void BeforeTest1() {
		System.out.println("This will execute Before Test");

	}
	@AfterTest
	public void AfterTest1() {
		System.out.println("This will execute After Test");
	}

	@Test
	public void Class1() {

		Assert.assertEquals(9, 9);

	}
}
