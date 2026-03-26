package Maven1;

import org.testng.annotations.Test;

public class Testngdependencies {
	@Test (dependsOnMethods = "openbrowser")
	public void loggout()
	{
		System.out.println("loggout");

	}

	@Test
  public void openbrowser()
	{
	System.out.println("Openning browser");
	}
	
	@Test (dependsOnMethods = "loggout")
	public void login()
	{
		System.out.println("loggin account");

	}
	
	
}
