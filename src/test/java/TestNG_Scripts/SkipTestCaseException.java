package TestNG_Scripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCaseException {
	Boolean datasetup=true;

	@Test(enabled=true)
	public void skiptest1()
	{
		System.out.println("Skip this test case as it is not completed");
	}
	@Test
	public void skiptest2()
	{
		System.out.println("Skip this test case it is not ready");
		throw new SkipException("Skip this test case");
	}
	
	@Test
	public void skiptest3()
	{
		System.out.println("Skip this test bases on condition");
		if(datasetup==true)
		{
			System.out.println("Execute test case");
		}
		else
		{
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
	}
}
