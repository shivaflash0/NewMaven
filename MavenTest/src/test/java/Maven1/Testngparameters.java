package Maven1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testngparameters {

	@Test(enabled = false)
	void tc1 ()
	{
		System.out.println("Ignoring test case");
	
	}
	@Test(priority = 1)
	void tc2()
	{
		System.out.println("priority case after 0 TC");
	}
	@Test
	void tc3() 
	{
		String data="id";
		if(data.contains("HJ"))
		{
			System.out.print("executed it ");
		}
		else {
			throw new SkipException("Skip this case"); // skipping in testng
		}
	}
	
}
