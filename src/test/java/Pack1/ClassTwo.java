package Pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	public void Class2() {
		
		int a=5, b=10;
		Assert.assertTrue(a<b);
	}

}
