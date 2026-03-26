package Maven1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdiffclass {
	
	@Test(dataProvider="login",dataProviderClass =Dataproviderdiffclass2.class )
	public void logintest(String user, String pass)
	{
		System.out.println("Start testing");
		System.out.println(user+"_____"+pass);
		System.out.println("End testing");
	}
}
