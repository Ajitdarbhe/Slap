package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Htmltable {

	public static void main(String[] args) 
	{
		WebDriver d=new FirefoxDriver();
		
		d.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(d.findElement(By.xpath(".//*[@id='customers']/tbody/tr[2]/td[1]")).getText());
		
		WebElement e=d.findElement(By.id("customers"));//rows count 
		List<WebElement> row=e.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		List<WebElement> cell=e.findElements(By.tagName("td"));//rows data count 
		/*for (WebElement webElement : row) {
			System.out.println(webElement.);
			Thread.*/
		
		
		System.out.println(e.getText().replaceAll("\t", "").replaceAll("\n", ""));
		
		

	}

}
