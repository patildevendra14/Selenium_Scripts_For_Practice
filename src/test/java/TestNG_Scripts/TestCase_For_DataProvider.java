package TestNG_Scripts;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//      File1:-TestCase  we are fetching username&password from differentfile
public class TestCase_For_DataProvider {
	
	@Test(dataProvider="create", dataProviderClass=DataProvider_Multi_UsernamePassword.class)
	public void testcase1(String username, String password, String message)
	{
		System.out.println(username+"==="+password+"===="+message);
	}

	@Test(dataProvider="create", dataProviderClass=DataProvider_Multi_UsernamePassword.class)
	public void testcase2(String username, String password,String message)
	{
		System.out.println(username+"==="+password+"===="+message);
	}

}


//File2:-TESTCase  

/*public class DataProvider_Multi_UsernamePassword {
	@DataProvider(name="create")
	public Object[][] dataset1(Method m)
	
	{
		Object [] [] testdata= null;
		
		if(m.getName().equals("testcase1")){
			testdata=new Object[][]
		
		{
			{"username","password","message"},
			{"username1","password1","message1"}
			
		};
      }
		else if (m.getName().equals("testcase2")){
			testdata=new Object[][]
					
					{
				{"username","password","message"},
				{"username1","password1","message1"}
				
					};
		}
		return testdata;
	}
}*/