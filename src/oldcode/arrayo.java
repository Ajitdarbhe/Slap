package oldcode;
import java.util.Arrays;

public class arrayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30,40};
		String [] b= {"a","b","c","d"};
		System.out.println(a.length);
		String str=Arrays.toString(b);
		System.out.println(str);
		
		boolean f=Arrays.asList(b).contains("a");
		System.out.println(f);
		
	}

}
