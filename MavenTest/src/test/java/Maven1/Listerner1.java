package Maven1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners(Maven1.Listenercls.class) public class Listerner1 {
	
	public void test1()
	{
		System.out.println("This is first test");
		Assert.assertTrue(true);
		
	}
	
	public void test2()
	{
		System.out.println("This is second test");
		Assert.assertTrue(true);
		
	}

}
