package Maven1;

import org.testng.annotations.Test;

public class Groupping {
	
	@Test(groups = "Smoke")
	public void Smoke()
	{
		System.out.println("This is a smoke testing");
	}
	
	@Test(groups = "Smoke")
	public void Smoke2()
	{
		System.out.println("This is a smoke2 testing");
	}
	@Test(groups = "Sanity")
	public void Sanity()
	{
		System.out.println("This is a Sanity testing");
	}
	@Test(groups = "Sanity")
	public void Sanity2()
	{
		System.out.println("This is a Sanity2 testing");
	}
	@Test(groups = "Regression")
	public void Regression()
	{
		System.out.println("This is a Regression testing");
	}
}
