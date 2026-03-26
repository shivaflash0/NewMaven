package Maven1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidertest {
	
	@Test(dataProvider="login")
	public void logintest(String user, String pass)
	{
		System.out.println("Start testing");
		System.out.println(user+"_____"+pass);
		System.out.println("End testing");
	}
    @DataProvider(name="login")
    public static Object[][] getdata()
    {
    	return new Object[][]
    			{
    		{"Shiva","pass"},
    		{"Shiva1","pass1"},
    		{"Shiva2","pass2"},
    			};
    }
}
