package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class example1_arraylist 
{
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList(8);
		
		al.add("amol");
		al.add(505);
		al.add("pune");
		al.add(506);
		al.add(null);
		al.add(null);
		al.add("pass");
		al.add(55.5f);
		al.add(55);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.get(9));
		System.out.println(al.contains("pass"));
		System.out.println(al.contains("fals"));
		
		al.add(600);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		al.set(5, "yes");
		System.out.println(al);
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		
		for(int i=0 ; i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		for(Object s1:al)
		
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
