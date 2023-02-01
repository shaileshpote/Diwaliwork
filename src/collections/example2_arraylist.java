package collections;

import java.util.ArrayList;

public class example2_arraylist
{
public static void main(String[]args)
{
	ArrayList al= new ArrayList(8);
	
	al.add("amol");
	al.add(500);
	al.add(null);
	al.add(null);
	al.add("pass");
	
	
	System.out.println(al);
	System.out.println(al.contains(500));
	System.out.println(al.get(1));
	
	al.add("firstclass");
	
	System.out.println(al );
	
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
