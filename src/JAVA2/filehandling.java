package JAVA2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class filehandling {

	public static void main(String[] args) throws IOException
	{
		File f=new File("C:\\Users\\Sham\\Desktop\\ajit1");
		f.mkdir();
		//f.delete();
//		File f2=new File("C:/Users/Sham/Desktop/ajit1/a.txt");
	//	f2.createNewFile();
		//boolean a=f.exists();
		FileOutputStream f2=new FileOutputStream("C:/Users/Sham/Desktop/ajit1/a.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Eter the text");
		String s2=s.nextLine();
		//String s="Ajitdarbhe";
			byte b[]=s2.getBytes();
			f2.write(b);
			
			
		
	}

}
