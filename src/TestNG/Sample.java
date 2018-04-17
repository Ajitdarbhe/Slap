package TestNG;

import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample
{
		@Test
		public void VerTitle() 
		{ 
		WebDriver d=new FirefoxDriver();
		d.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
		String Title=d.getTitle();
		Assert.assertEquals(Title,"Google");
		}
		
}
	
