package Maven1;

import org.testng.annotations.DataProvider;

public class Dataproviderdiffclass2 {

	
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
