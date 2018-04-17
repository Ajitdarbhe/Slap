package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestUtil {
	private static WebDriver webDriver;
	public static WebDriver  launch() {
		webDriver= new FirefoxDriver();
	return webDriver;
	
	
	}
	
public static void close() {
	if(!webDriver.toString().contains("null")) 
	{
		webDriver.close();
	}
	
}
}
