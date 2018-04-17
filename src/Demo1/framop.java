package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framop {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d=new FirefoxDriver();
		d.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//d.switchTo().frame(2);
		//d.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
		d.switchTo().frame("classFrame");
		Thread.sleep(3000);
		d.findElement(By.xpath("html/body/div[1]/ul/li[1]/a")).click();
		d.switchTo().defaultContent();
		

	}

}
