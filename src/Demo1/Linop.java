package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linop {

	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.google.co.in/");
		//d.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		
		WebElement Glink=d.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		//boolean b=Glink.isEnabled();
		System.out.println("Glink is enabled: "+Glink.isEnabled());
		System.out.println("is dip: "+WebElement.class);
		System.out.println(Glink.getLocation());
	}

}
