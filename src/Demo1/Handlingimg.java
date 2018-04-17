package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingimg {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.google.co.in/");
		System.out.println(d.findElement(By.id("hplogo")).isDisplayed());
		System.out.println(d.findElement(By.id("hplogo")).getAttribute("title"));
		System.out.println(d.findElement(By.id("hplogo")).getText());
		
		d.navigate().to("http://newtours.demoaut.com/");
		d.findElement(By.name("login")).click();
		
		d.navigate().to("http://www.seleniumhq.org/");
		d.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
		

	}

}
