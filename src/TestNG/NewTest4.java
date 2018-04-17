package TestNG;

import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void Testcase1()
  {
	  long id=Thread.currentThread().getId();
	  System.out.println("Test case 1 successful Thread id is  "+id);
  }
  @Test
  public void Testcase2()
  {
	  long id=Thread.currentThread().getId();
	  System.out.println("Test case 2 successful Thread id is  "+id);
  }
  @Test
  public void Testcase3()
  {
	  long id=Thread.currentThread().getId();
	  System.out.println("Test case 3 successful Thread id is  "+id);
  }
}
