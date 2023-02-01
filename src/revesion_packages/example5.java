package revesion_packages;

import java.util.ArrayList;

public class example5 
{
	public static void main(String[]args)
	{
	ArrayList al =new ArrayList ();
	al.add("Rakesh");
	al.add(505);
	al.add(808);
	al.add(null);
	al.add(null);
	al.add(909);
	al.add(55.59f);
	al.add(66.6f);
	al.add(100);
	
		System.out.println(al);
		System.out.println(al.contains(808));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		al.set(5, 101);
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
