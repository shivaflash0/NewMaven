package Maven1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
	SoftAssert SoftAssert= new SoftAssert();
	String className="Softassertion";
	@Test
	public void softasert_test()
	{
  SoftAssert.assertEquals(true, true);
  SoftAssert.assertEquals("softassert","softassert");
  SoftAssert.assertEquals(className,"Softassern");
	System.out.println("This is success!");
	SoftAssert.assertAll();

}
	@Test
	public void softasert_test2()
	{
  SoftAssert.assertEquals(true, true);
  SoftAssert.assertEquals("softassert","softassert");
  SoftAssert.assertEquals(className,"Softassertin");
	System.out.println("This is success!");
	SoftAssert.assertAll();

}

	}
