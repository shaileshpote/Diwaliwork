package revesion_packages;

import java.util.HashSet;
import java.util.Iterator;

public class example3
{
	public static void main(String[]args)
	{
		
		HashSet hs=new HashSet();
		
		hs.add("amol");
		hs.add(202);
		hs.add(5);
		hs.add(55.5f);
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.contains(202));
		System.out.println(hs.contains(55.5));
		
		hs.add(505);
		System.out.println(hs);
		
		hs.remove(5);
		System.out.println(hs);
		
		Iterator litr=hs.iterator();
		while(litr.hasNext());
		{
			System.out.println(hs);
			
		}
		
		for(int i = 0 ; i<=hs.size()-1 ; i++)
		{
			System.out.println(hs);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
