package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {

	public static void main(String[] args) 
	{
		xyz();
		
	}

	public static void xyz() {
		System.setProperty("webdriver.chrome.driver", "F:\\New Selenium soft\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		WebDriver d2=new FirefoxDriver();
		d2.get("https://www.flipkart.com/");
		d.get("https://www.google.co.in/");
		System.out.println(d.getCurrentUrl());
		String s=d.getCurrentUrl();
		
		if(s.equals(d.getCurrentUrl())) 
		{
			System.out.println("Google was lanch");
		}
		else 
		{
			System.out.println("Google was not lanch");
		}
		
		String s2="Googl";
		if(s2.equals(d.getTitle())) 
		{
			System.out.println("page title is google");
			
		}
		else 
		{
			
			System.out.println("page title was not match");

		
		}
		System.out.println("in firefox open link is   "+d2.getCurrentUrl());
	}
}