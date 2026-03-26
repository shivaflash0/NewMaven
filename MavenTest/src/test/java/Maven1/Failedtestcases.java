package Maven1;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failedtestcases {
	
	@Test
	public void test1()
	{
		System.out.println("testcase 1");
	}
	@Test
	public void test2()
	{
		System.out.println("testcase 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("testcase 3");
		Assert.assertTrue(false);
	}
	@Test
	public void test4()
	{
		System.out.println("testcase 4");
	}

}
