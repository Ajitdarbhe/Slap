package oldcode;
import java.util.ArrayList;
import java.util.List;

public class demo {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		for(int i=0;i<200;i++)
		list.add("string"+i);
		long t1=System.currentTimeMillis();
		list.parallelStream().forEach(a->{System.out.println(a+"  "+Thread.currentThread().getName());});
		long t2=System.currentTimeMillis();
		
		
		long t3=System.currentTimeMillis();
		list.stream().forEach(a->System.out.println(a+"   "+Thread.currentThread().getName()));
		long t4=System.currentTimeMillis();
		
		System.out.println(t4-t3);
		System.out.println(t2-t1);
		
		
		
	}

}
