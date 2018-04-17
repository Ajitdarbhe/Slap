package TestCases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTCLOGIN {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		d.findElement(By.id("usernameId")).sendKeys("ajitdarbhe");
		d.findElement(By.name("j_password")).sendKeys("ajiyt");
		Thread.sleep(1000);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the capcha code");
		String s=scan.nextLine();
		d.findElement(By.id("nlpAnswer")).sendKeys(s);
		Thread.sleep(1000);
		d.findElement(By.id("loginbutton")).click();

	}

}
