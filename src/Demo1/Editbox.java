package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Editbox 
{
	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='u_0_f']")).sendKeys("Ajit");
		d.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("Darbhe");
		d.findElement(By.xpath(".//*[@id='u_0_k']")).sendKeys("989030");
		d.findElement(By.xpath(".//*[@id='u_0_f']")).clear();
		d.findElement(By.xpath(".//*[@id='u_0_k']")).click();
		String s2=d.findElement(By.id("js_mx")).getText();
		System.out.println(s2);
		String s=d.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/div/div")).getText();
		System.out.println(s);
		

	}

}
