package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		
		d.navigate().to("http://www.gcrit.com/build3/create_account.php");
		Select s=new Select(d.findElement(By.name("country")));
		s.selectByIndex(30);
		s.selectByVisibleText("India");
		
		List<WebElement> e=s.getOptions();
		int i=e.size();
		System.out.println(i);
		

	}

}
