package Demo1;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multibrowsertest {

	public static void main(String[] args ) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(4000);
		d.findElement(By.xpath("html/body/div[1]/div/div[6]/div/table/tbody/tr/td[3]/a/span/img")).click();
		//d.findElement(By.className("_3BNkWJ _2EqWRh")).click();
		String s=d.getWindowHandle();
		//System.out.println(s);
		Set<String> handle=d.getWindowHandles();
		System.out.println(handle.size());
		
		for(String s1:handle)
		{
			if(!s1.equals(s)) 
			{
				d.switchTo().window(s1);
				System.out.println(d.getCurrentUrl());
				
			}
			
			d.switchTo().window(s1);
			System.out.println(d.getCurrentUrl());
			
				
				
		}
		
		
		

	}

}
