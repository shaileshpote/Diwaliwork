package actionclass;

import java.util.HashMap;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class example56 
{
	public static void main (String[]args)
	{
		
		HashMap<Integer,String > mp=new HashMap< Integer , String>();
		
		mp.put(101," rakesh");
		mp.put(102, "amol");
		mp.put(103, "sachine");
		
		
		mp.put(101,"manoj ");
		
		System.out.println(mp);
		
	System.out.println(mp.containsKey(102));
		
   System.out.println(mp.containsValue( "amo"));
   
   System.out.println(mp.get("amol") );
		
		System.out.println(mp.isEmpty());
		
		System.out.println(mp.size());
		
		System.out.println(mp.get(103));
		
		System.out.println(" all ty of keys");
		
		         Set<Integer> allkeys = mp.keySet();
		
		for(Integer key: allkeys )
		{
			System.out.println(key +" : " +mp.get(key)  );
		}
		
		
		
		
	}

}
