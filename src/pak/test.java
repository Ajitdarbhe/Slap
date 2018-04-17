package pak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//Launch browser black url
		driver.get("https://www.google.co.in/");
		String Title =driver.getTitle();
		System.out.println(Title);
		//String ps=driver.getPageSource();
		//System.out.println(ps);
		String cu=driver.getCurrentUrl();
		System.out.println(cu);
		driver.navigate().to("https://www.youtube.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.close();//close 
		driver.navigate().back();

	}

}
