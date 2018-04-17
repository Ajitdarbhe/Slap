package oldcode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehand {

	public static void main(String [] args) throws IOException {
		File FB= new File("C:/Users/Sham/Desktop/Ajit.txt");
		
		
		/*FileWriter fw=new FileWriter(FB);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("AJIt darbe welcome");
		
		bw.close();
		fw.close();*/
		
		BufferedReader br= new BufferedReader(new FileReader(FB));
		do
		{
			System.out.println(br.readLine());
		}while(br.readLine()!=null);
		
		
		br.close();
				
		
		
	}
}
