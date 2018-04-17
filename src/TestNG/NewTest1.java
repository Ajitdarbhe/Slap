package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1
{
	@BeforeTest
	public void Login() 
	{
		System.out.println("Login Successful");
		
	}
	@AfterTest
	public void logout() 
	{
		System.out.println("Logout Successful");
	}
	@Test
	public void add1() 
	{
		System.out.println("ADD1");
	}
	@Test
	public void add2() 
	{
		System.out.println("ADD2");
	}
  
}
