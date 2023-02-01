package logicalprogram;

public class example41 
{
	public static void main(String[]args)
	{
		String src="a b c d e  f";
		
		int count= 0 ;
		
		for (int  i = 0 ; i<=src.length()-1 ; i++    )
		{
			 char s1 = src.charAt(i);
			
			    if ( s1==' ')
			    {
			    	
			    	count++;
			    }
				
		}
		
		System.out.println(count);
		
		
		
		
		
	}

}
