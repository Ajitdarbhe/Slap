package Demo1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multibrowser 
{
	public static WebDriver d;
	static int browser;
	public static String Bname;
	
	public static void main(String[] args) 
	{// int browser;
		for(browser=1;browser<=2;browser++)
		{
			if(browser==1)
			{
				d=new FirefoxDriver();
				System.out.println("FireFox was lanch");
				
			}
			else 
			{
				System.setProperty("webdriver.chrome.driver", "F:\\\\New Selenium soft\\\\chromedriver.exe");
				d=new ChromeDriver();
				System.out.println("Chrome was lanch");
				
			}
			d.get("https://www.google.co.in/");
			
			
			
		}
	}

}
