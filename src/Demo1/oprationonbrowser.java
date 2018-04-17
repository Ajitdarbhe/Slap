package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class oprationonbrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=urq8WaaiNq_y8Af5-K3oDA");
		String str1=d.getTitle();
		System.out.println(str1);
		String curl=d.getCurrentUrl();
		System.out.println(curl);
		d.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String curl2=d.getCurrentUrl();
		System.out.println(curl2);
		d.navigate().back();
		d.navigate().refresh();
		Thread.sleep(10000);
		d.navigate().forward();
		d.manage().window().maximize();
		
		
		
	}
}
