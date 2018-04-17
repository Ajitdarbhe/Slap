package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingBrowser {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		String str1=d.getTitle();
		System.out.println(str1);
		
		String url=d.getCurrentUrl();
		System.out.println(url);
		
		String pgso=d.getPageSource();
		//System.out.println(pgso);
		
		String winh=d.getWindowHandle();
		System.out.println(winh);
		
		
		

	}

}
