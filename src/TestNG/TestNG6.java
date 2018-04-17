package TestNG;

import org.testng.annotations.Test;

public class TestNG6
{

	@Test
	  public void Testcase4()
	  {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 4 successful Thread id is  "+id);
	  }
	  @Test
	  public void Testcase5()
	  {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 5 successful Thread id is  "+id);
	  }
	  @Test
	  public void Testcase6()
	  {
		  long id=Thread.currentThread().getId();
		  System.out.println("Test case 6 successful Thread id is  "+id);
	  }
}
