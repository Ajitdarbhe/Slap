package Demo1;

public class StringDemo {
	
	public static void main(String[] args) {
		String s1=new String("hello");
		String s2="hello";
		System.out.println(s1.hashCode()+"\n"+s2.hashCode());
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else {
			System.out.println(" not equal");
		}
	}

}
