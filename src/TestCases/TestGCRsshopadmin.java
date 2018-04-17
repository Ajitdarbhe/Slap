package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGCRsshopadmin
{	
	public static WebDriver d;
	
		public static WebDriver lanch() 
		{
			 d=new FirefoxDriver();
			 return d;
		}
		
	public void admin() 
	{
		d.get("http://www.gcrit.com/build3/login.php");
		d.findElement(By.name("email_address")).sendKeys("ajit");
		d.findElement(By.name("password")).sendKeys("ajit");
		
	}
	public void admin(String email_address, String password ) 
	{
		d.get("http://www.gcrit.com/build3/login.php");
		d.findElement(By.name("email_address")).sendKeys(email_address);
		d.findElement(By.name("password")).sendKeys(password);
		
	}
	public void closeb() 
	{
		if(!d.toString().contains("null")) 
		{
			d.close();
		}
			
	}

	public static void main(String[] args) 
	{
		TestGCRsshopadmin t=new TestGCRsshopadmin();
		t.lanch();
		t.admin();
		t.closeb();
		t.lanch();
		t.admin("ajitdarbhe","darbhe");
		

	}

}
