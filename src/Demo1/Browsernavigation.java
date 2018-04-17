package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsernavigation 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.navigate().to("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=q_S8Wdv2BtHy8Af_komwCw&gws_rd=ssl");
		System.out.println(d.getCurrentUrl());
		d.navigate().back();
		Thread.sleep(5000);
		System.out.println(d.getCurrentUrl());
		Thread.sleep(5000);
		d.navigate().forward();
		System.out.println(d.getCurrentUrl());
		
		

	}

}
