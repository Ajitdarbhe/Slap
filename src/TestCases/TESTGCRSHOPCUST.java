package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TESTGCRSHOPCUST {

	public static void main(String[] args) throws InterruptedException
	{
		//WebDriver d=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\\\New Selenium soft\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.gcrit.com/build3/index.php?osCsid=h32rvbplp78iv849sf86qoab77");
		d.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
		System.out.println("Create accout page was lanched");
		
		d.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		d.findElement(By.name("firstname")).sendKeys("ajit");
		d.findElement(By.name("lastname")).sendKeys("da");
		d.findElement(By.name("dob")).sendKeys("08/15/1990");
		d.findElement(By.name("email_address")).sendKeys("ajitda@gmail.com");
		d.findElement(By.name("street_address")).sendKeys("hadapsargaon");
		d.findElement(By.name("postcode")).sendKeys("312340");
		d.findElement(By.name("city")).sendKeys("pune");
		d.findElement(By.name("state")).sendKeys("MAH");
		Select s=new Select(d.findElement(By.name("country")));//imp select drop down link
		s.selectByVisibleText("India");
		d.findElement(By.name("telephone")).sendKeys("1234567890");
		d.findElement(By.name("newsletter")).click();
		d.findElement(By.name("password")).sendKeys("ajitdarbhe");
		d.findElement(By.name("confirmation")).sendKeys("ajitdarbhe");
		Thread.sleep(3000);
		d.findElement(By.id("tdb4")).click();
		if(d.getCurrentUrl().contains("http://www.gcrit.com/build3/create_account_success.php"))
		{
			System.out.println("Login was sucessful");
		}
		else 
		{
			System.out.println("login was not succesful");
		}
		//boolean a;
		if(d.findElement(By.linkText("Log Off")).isDisplayed())
				{
						System.out.println("logof link was there");
				}
		
			

	}

}
