package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demotestcase {

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("https://en.wikipedia.org/wiki/Main_Page");
		
		d.findElement(By.linkText("Create account"));
		if(d.getCurrentUrl().contains("wikipedia.org")) 
		{
			System.out.println("link was internal link");
		}
		else
		{
			System.out.println("link was not internal link");
		}
		System.out.println(d.getCurrentUrl());
		d.navigate().to("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		d.findElement(By.xpath(".//*[@id='mw-content-text']/div/table[2]/tbody/tr[11]/td/span/a")).click();
		if(d.getCurrentUrl().contains("wikipedia.org")) 
		{
			System.out.println("link was internal link");
		}
		else
		{
			System.out.println("link was not internal link");
		}
		System.out.println(d.getCurrentUrl());
		d.close();
		

	}

}
