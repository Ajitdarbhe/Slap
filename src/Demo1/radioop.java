package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioop
{
	public static void main(String[] args)
	{
		WebDriver d=new FirefoxDriver();
		
		d.navigate().to("http://www.gcrit.com/build3/create_account.php");
		WebElement w = d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		w.click();
		boolean ests=w.isDisplayed();
		System.out.println(ests);
		
		System.out.println(w.isSelected());
		System.out.println(w.isEnabled());
		
		
		
		
	}

}
