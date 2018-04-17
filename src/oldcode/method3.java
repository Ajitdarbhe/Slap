package oldcode;

public class method3 {
	public int sub(int a,int b) 
	{
		int d=a-b;
		return d;
		
	}

	public static void main(String [] args) 
	{
		method3 t2=new method3();
		System.out.println(t2.sub(10, 5));
		
		method2 t=new method2();
		int c=t.add(10,20);
		System.out.println(c);
		
	}
}
