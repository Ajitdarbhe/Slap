package oldcode;

public class Method 
{
	//user defain method
			public int multiply(int a,int b,int c)
			{
				int result=a*b*c;
				return result;
			}
	/*// with out create ing object
	public static int multi(int d,int e,int f) 
	{
		int result =(d*e*f);;
		return result;
		
	}*/
	//method without returning any value 
	public void div(int x,int y) 
	{
		int z=x*y;
		System.out.println(z);
	}
	
			
	public static void main(String [] args) 
	{
		//create object 
		Method a=new Method();
		//call method 
		int x=a.multiply(20,30,40);
		System.out.println(x);
		System.out.println(a.multiply(10, 30, 40));
		
		/*//call method without object
		int y=multi(10,20,30);
		System.out.println(y);
		System.out.println(multi(10,20,20));*/
		//not returing any value 
		a.div(30,2);
		
		
		
	}

}
