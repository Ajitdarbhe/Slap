package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sameobj {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
		d.findElement(By.xpath(".//*[@id='new-account-btn']")).click();
		d.findElement(By.id("password")).sendKeys("ajit");
		d.findElement(By.xpath(".//*[@id='social_sites']/div/span[1]/a/img")).click();
		

	}

}
