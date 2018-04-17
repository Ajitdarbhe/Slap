package TestNG;

import org.testng.annotations.Test;

public class GoogleTestNG 
{
	@Test (priority =1)
	public void Login() 
	{
		System.out.println("Log In was Successful");
	}
	@Test (priority =2)
	public void Search() 
	{
		System.out.println("Search was Successful");
		
	}
	@Test (priority =3)
	public void Asearch() 
	{
		System.out.println("Asearch was Successful");
	}
	
	@Test  (dependsOnMethods= {"Login"})
	public void Logout() 
	{
		System.out.println("Logout was Successful");
	}
	
}
