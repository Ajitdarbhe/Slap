package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) 
	{
		WebDriver D= new  FirefoxDriver();
		D.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		D.findElement(By.xpath(".//*[@id='Email']")).sendKeys("ajitdarbhe");
		D.findElement(By.xpath(".//*[@id='next']")).click();
		D.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#password");
		
		D.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("ajit");
		D.findElement(By.xpath(".//*[@id='signIn']"));
		
		
		String str =D.getCurrentUrl();
		if(str.equals("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#password\"")){
			System.out.println("Log in gmail");
		} else {
			System.out.println("error");
		}
		D.close();

	}

}
