package revesion_packages;

import java.util.Iterator;
import java.util.LinkedList;

public class example2 
{
	public static void main(String[]args)
	{
		LinkedList s2=new LinkedList();
		s2.add("amol");
		s2.add(101);
		s2.add(202);
		s2.add(65.5f);
		s2.add(null);
		s2.add(null);
		
		System.out.println(s2);
		System.out.println(s2.get(2));
		System.out.println(s2.size());
		System.out.println(s2.contains(202));
		System.out.println(s2.contains(500));
		System.out.println(s2.isEmpty());
		System.out.println(s2.get(3));
		System.out.println(s2.getFirst());
		System.out.println(s2.element());
		System.out.println(s2.getLast());
		System.out.println(s2.toString());
		System.out.println(s2.get(4) );
		System.out.println(s2.containsAll(s2));
		
		s2.add(4, 202);
		System.out.println(s2);
		
		s2.remove(4);
		System.out.println(s2);
		
		s2.set(0, "Amol");
		System.out.println(s2);
		
		System.out.println("....print info using interator ..........");
		Iterator litr=s2.iterator();
		while(litr.hasNext())
		
		{
			System.out.println(litr.next());
		}
		
		System.out.println(" print info using for loop");
		
		for(int i= 0; i<=s2.size()-1; i++)
		{
			
			System.out.println(s2.get(i));
		}
		
		System.out.println(" .......print info using foreach loop     ");
		
		for( Object s1:s2)
		{
			System.out.println(s1);
		}
		
		
		
	}

}
