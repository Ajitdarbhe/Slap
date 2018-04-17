package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dj  
{

	public static void main(String[] args)
	{
		WebDriver webDriver=TestUtil.launch();
		
		webDriver.get("https://www.google.co.in/");
		webDriver.findElement(By.name("Gmail")).click();
	}

}
