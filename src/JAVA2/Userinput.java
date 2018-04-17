package JAVA2;

import java.util.Scanner;

public class Userinput 
{

	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the value of  A : \n");
		a=scan.nextInt();
		System.out.println("Enter the  value of B \n");
		b=scan.nextInt();
		
		int c=a+b;
		System.out.println("Addistion of A and B is"+c);
		

	}

}
