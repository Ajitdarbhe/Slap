package JAVA2;

public class math 
{
	static int a=10;
	int b=20;
	int c;
	public void add() 
	{
		c=a+b;
		System.out.println("Addistion:-"+ c);
		a=c;
	}
	public void sub() 
	{
		c=a-b;
		System.out.println("substrction:"+ c);
	}

	public static void main(String[] args) 
	{
		math obj=new math();
		obj.add();
		obj.sub();
	}

}
