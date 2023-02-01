package logicalprogram;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class example57 
{
	public static void main (String[]args)
	{
		HashedMap<Integer, String > mp =new HashedMap< Integer , String>();
		
		mp.put(101, "amol");
		mp.put(102, " sachine");
		mp.put(103, "mahesh");
		
		System.out.println(mp.get(101));
		
		System.out.println(mp.containsKey(103));
		
		System.out.println(mp.isEmpty());
		
		System.out.println(mp.size());
		
		System.out.println(mp.replace(103, "mahesh"));
		
		System.out.println(mp);
		
		mp.put(102, "nilesh");
		
		System.out.println(mp);
		
		      Set<Integer> allkeys = mp.keySet();
		
		for(Integer key :allkeys )
		{
			System.out.print(key+" :" + mp.get(key));
		}
		
		
		
		
		
		
	}

}
