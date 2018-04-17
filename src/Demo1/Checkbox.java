package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox 
{
	public static void main(String[] args) 
	
	{
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://www.gcrit.com/build3/create_account.php?osCsid=l3112stem3u2tmhuatb3v1c5u1");
		System.out.println(d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")).isDisplayed());
		System.out.println(d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")).isEnabled());
		d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")).click();
		System.out.println(d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[3]/td[2]/input")).isSelected());
		
	}

}
