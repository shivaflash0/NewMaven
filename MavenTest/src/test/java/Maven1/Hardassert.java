package Maven1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {
	String className="Hardassert";
	@Test
	public void hardassertion() {
		Assert.assertEquals(true,true);
		Assert.assertEquals("Hardassertion", "Hardassertion");
		Assert.assertEquals(className,"Hardassert");
		System.out.println("This is success!");
	}

	@Test
	public void hardassertion2() {

	{
		Assert.assertEquals(true,true);
		Assert.assertEquals("Hardassertion", "Assertion");
		Assert.assertEquals(className,"Hardassert");
		System.out.println("This is success!");	
	}
}
}
