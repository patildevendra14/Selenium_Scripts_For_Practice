package TestNG_Scripts;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvider_Multi_UsernamePassword {
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
}
