package JAVA2;

public class Arr {

	public static void main(String[] args)
	{
		String [] lang= {"ab","bb","cb"};
		for(String l:lang) 
		{
			
			System.out.println(l);
		}
		double a=10,b=20;
		double [] math=new double[4];
		math[0]=a+b;
		math[1]=a-b;
		//math[2]=a*b;
		//math[3]=a/b;
		
		for(double c:math) 
		{
			System.out.println(c);
			
		}
	}

}
