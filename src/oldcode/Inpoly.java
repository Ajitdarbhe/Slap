package oldcode;

public class Inpoly {
	//declare static variables
	static int a=10,b=20;
	int c=30,d=40;
	public static int add()
	{
		int result =a+b;
		return result;
	}
	public static void sub() {
		System.out.println(a*b);
		
	}
	public int div() {
		int res=a/b;
		return res;
		
		
	}
	public static void main(String[] args) {
		int x=Inpoly.add();
		System.out.println(x);
		Inpoly.sub();
		
	}

}
