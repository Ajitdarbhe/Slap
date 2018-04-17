package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlemouseover {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://www.unipune.ac.in/");
		//create action builder instance pasing webdriver intance 
		Actions a=new Actions(d);
		/*WebElement w=d.findElement(By.linkText("Academics"));
		Thread.sleep(2000);
		a.moveToElement(w).build().perform();
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='stUI44_txt']")).click();*/
		
		WebElement w1=d.findElement(By.linkText("Administration"));
		Thread.sleep(2000);
		a.moveToElement(w1).build().perform();
		Thread.sleep(4000);
		d.findElement(By.linkText("Vice Chancellor Office")).click();;
	d.navigate().refresh();

	}

}
