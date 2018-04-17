package TestCases;

public class Interphase extends TestGCRsshopadmin 
{

	public static void main(String[] args) 
	{
		Interphase i=new Interphase();
		//i.lanch();
		//i.admin();
		//i.closeb();
		i.lanch();
		i.admin("a", "b");
		//i.closeb();
		String url=d.getCurrentUrl();
		
		if(!url.equals("http://www.gcrit.com/build3/login.php")) 
		{
			System.out.println("login");
		}
		System.out.println("LOGIN");
		
		

	}

}
