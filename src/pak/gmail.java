package pak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();//Launch browser black url
		driver.get("https://accounts.google.com/login/identifier?hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("Email")).sendKeys("ajitdarbhe");
		driver.findElement(By.id("next")).click();
		
		
		
		
	}

}
