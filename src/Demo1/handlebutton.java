package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlebutton {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.facebook.com/");
		d.findElement(By.id("u_0_x")).click();
		
		System.out.println(d.findElement(By.id("u_0_x")).isDisplayed());
		System.out.println(d.findElement(By.id("u_0_x")).isEnabled());
		System.out.println(d.findElement(By.id("u_0_x")).getAttribute("type"));
		System.out.println(d.findElement(By.id("u_0_x")).getAttribute("name"));
		
		

	}

}
