package TestNG;

import org.testng.annotations.Test;

public class NewTest3
{	@Test (groups= {"sanity","regression"})
	public void fundt() 
	{
		System.out.println("Fund transfered");
	}
	@Test (groups= {"sanity"})
	public void fundadd() 
	{
		System.out.println("Fund add transfered");
	}
	@Test  (groups= {"regression"})
	public void funddel() 
	{
		System.out.println("Fund del transfered");
	}
	@Test	(groups= {"regression"})
	public void fundremove() 
	{
		System.out.println("Fund remove transfered");
	}
  
}
