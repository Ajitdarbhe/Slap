package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcasewebelement {

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=R_rBWZCfKaL98wfSvIJ4&gws_rd=ssl");
		if(!d.findElement(By.linkText("Gmail")).isDisplayed())
		{
			System.out.println("gmail link was not  exists");
		}
		System.out.println("gmail link was exists");
		boolean b=d.findElement(By.linkText("Gmail")).isEnabled();
		
		if(b==true) 
		{
			System.out.println("link was enabled ");

		}
		else 
		{
			System.out.println("Link was not enabled");
		}

}

}