package Maven1;

import org.testng.annotations.Test;

public class Invocationdcnt {		
		@Test(invocationCount = 2) // below method void login will run two times
		void login ()
		{
			System.out.println("login fail");
			
		}
		@Test
		void reset()
		{
			System.out.println("Reset account");
		}

}
