package TestNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriven2 
{	@Test(dataProvider="data")
	public void add(String v1,String v2,String v3) 
	{
		int a=Integer.parseInt(v1);
		int b=Integer.parseInt(v2);
		int c=Integer.parseInt(v3);
		int result=a+b+c;
		System.out.println(result);
		
	
	}

	
	@DataProvider(name="data")
	public Object[][] readxls() throws BiffException, IOException 
	{
		
	File f=new File("C:/Users/Sham/Desktop/Input.xls");
	Workbook w=Workbook.getWorkbook(f);
	Sheet s=w.getSheet(1);
	int row=s.getRows();
	int col=s.getColumns();
	//System.out.println(row);
	//System.out.println(col);
	
	String inputdata[][]=new String[row][col];
	for(int i=0;i<row;i++) 
	{
		for(int j=0;j<col;j++) 
		{
			Cell c=s.getCell(j,i);
			inputdata[i][j]=c.getContents();
			//System.out.println(inputdata[i][j]);
			
		}
	}
	return inputdata;
	}

}
