package Maven1;

public class ParallelThread
{
  @org.testng.annotations.Test
	public void logintest1()
	{
		System.out.println("First test " + Thread.currentThread().getId());
	}
  @org.testng.annotations.Test
 	public void logintest2()
 	{
 		System.out.println("Second test " + Thread.currentThread().getId());
 	}
  @org.testng.annotations.Test
 	public void logintest3()
 	{
 		System.out.println("Third test " + Thread.currentThread().getId());
 	}
}
