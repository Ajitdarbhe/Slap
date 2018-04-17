package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spantag {

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.google.co.in/");
		d.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		d.findElement(By.xpath(".//*[@id='gb192']/span[1]")).click();
		d.navigate().back();
		
		

	}

}
