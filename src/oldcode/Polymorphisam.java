package oldcode;
import java.util.Scanner;
class Base
{
	public int add(int a,int b) {
		System.out.println("Base");
		return a+b;
	}
}
class Base1 extends Base {
	
	public int add(int a,int b) {
		System.out.println("Base1");
		return a+b;
	}
	
}

public class Polymorphisam extends Base1{
	
	public int add(int a,int b) {
		System.out.println("Polymorphisam");
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two int value");
		int a=s.nextInt();
		int b=s.nextInt();
		
		
		Base base=new Polymorphisam();//
		
		base.add(a, b);//Polymorphisam
Base ba=new Base1();//
		
		ba.add(a, b);//base1
		
		Base ba1=new Base();//
		ba1.add(a, b);
	}

}
