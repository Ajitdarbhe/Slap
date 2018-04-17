package TestNG;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class datadriventest 
{	public WebDriver d;
	@Test(dataProvider="data")
	
	public void login(String uname,String pass) throws InterruptedException 
	{
		System.out.println("2");
		d= new FirefoxDriver();
		d.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		d.findElement(By.id("Email")).sendKeys(uname);
		d.findElement(By.id("next")).click();
		Thread.sleep(2000);
		d.findElement(By.id("Passwd")).sendKeys(pass);
		Assert.assertEquals("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#password", d.getCurrentUrl());
		d.close();
		
	}
	
	
	
	@DataProvider(name="data")
	public Object [][] readexl() throws BiffException, IOException
	{
		//System.out.println("1");
		File f=new File("C:/Users/Sham/Desktop/Input.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		int row=s.getRows();
		int col=s.getColumns();
		//System.out.println(row);
		//System.out.println(col);
		
		String inputdata [] []=new String[row][col];
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				Cell c=s.getCell(j,i);
				inputdata[i][j]=c.getContents();
				System.out.println(inputdata[i][j]);
				
			}
		}
		return inputdata;
		

	}

}
