package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=qhi-WZ3CHqzy8AfipK7YAg&gws_rd=ssl");
		d.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		//d.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		
		d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("ajitdarbhe");
		
		d.findElement(By.xpath(".//*[@id='next']")).click();
		
		Thread.sleep(10000);
		
		d.findElement(By.id("Passwd")).sendKeys("avi");
		d.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		System.out.println(d.findElement(By.xpath(".//*[@id='errormsg_0_Passwd']")).getText());
		
		
		}

}
