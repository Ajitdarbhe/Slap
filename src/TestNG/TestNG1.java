package TestNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG1
{
	public WebDriver d;
	@Test 
	public void LauchB() 
	{
		 d=new FirefoxDriver();
		
	}
	@Test
	public void Title() 
	{
		d.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		Assert.assertEquals("mail", d.getTitle());
		
		
		
	}
	
}
