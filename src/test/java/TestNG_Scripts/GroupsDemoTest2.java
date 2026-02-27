package TestNG_Scripts;

import org.testng.annotations.Test;

import Common.CommonDataSetup;

public class GroupsDemoTest2  extends CommonDataSetup{
	
	
	
	@Test(priority=1, groups="regression")
	public void bTest1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=2, groups="regression")
	public void bTest2() 
	{
		System.out.println("Test2");
	}
	
	@Test(groups= {"regression","pvr"})
	public void bTest3()
	{
		System.out.println("Test3");
	}
	
	@Test(groups="pvr")
	public void bTest4()
	{
		System.out.println("Test4");
	}

}
