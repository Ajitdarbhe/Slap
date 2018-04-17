package JAVA2;

public class Basic_program 
{
	int res;
	public void multi(int a,int b,int c)
	{
		this.res=a*b*c;
	}

	public static void main(String[] args)
	{
		
		/*int a=100;
		int b=50;
		System.out.println("Addistion of two numbers"+(a+b));
		if(a<b) 
		{
			System.out.println("A");
			
		}
		else 
		{
			System.out.println("B");
		}
		for(int x=0;x<4;x++)
		{
			System.out.println(x);
		}*/
		Basic_program obj=new Basic_program();
		obj.multi(10, 20, 30);
		System.out.println(obj.res);

	}

}
