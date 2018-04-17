package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Syncronization {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=qhi-WZ3CHqzy8AfipK7YAg&gws_rd=ssl");
		System.out.println("before thread"+System.currentTimeMillis());
		Thread.sleep(5000);
		System.out.println("after thread"+System.currentTimeMillis());
		
		d.findElement(By.linkText("Gmail")).click();
		System.out.println("before click sign in "+System.currentTimeMillis());
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("after wait "+System.currentTimeMillis());
		
		d.findElement(By.name("signIn")).click();
		d.close();

	}

}
