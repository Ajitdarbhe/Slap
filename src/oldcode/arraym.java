package oldcode;
import java.util.Arrays;
import java.util.Scanner;

public class arraym {
	public int m1(int[] a) {
		/*for (int i : a) {
			System.out.println(i);
		}
		return 0;*/
		System.out.println(Arrays.equals(a, a));
		boolean b[]=new boolean[2];
		
		System.out.println(Arrays.equals(b, b));
		return 0;
	}
	public static void main(String[] args) {
		arraym a=new arraym();
		Scanner scan=new Scanner(System.in);
		int b[]=new int[3];
		
		for(int i=0;i<=2;i++) 
		{
		b[i]=scan.nextInt();
		}
		a.m1(b);
		scan.close();
		
		
	}

}
