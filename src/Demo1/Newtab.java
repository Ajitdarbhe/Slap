package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtab 
{
	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		System.out.println(d.getCurrentUrl());
		//d.get("https://www.google.co.in/");
		
		
	}
	

}
