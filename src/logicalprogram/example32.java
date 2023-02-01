package logicalprogram;

public class example32 
{
	public static void main(String[]args)
	{
		
	String org = "ab  c d ef";
		
		int count = 0 ;
		
		for (int i =0 ; i<=org.length()-1 ; i++)
		
		{
			
			char s1 = org.charAt(i);
			
			if (s1==' ')
			{
				
				count++;
			}
			
			
		}
		
		System.out.println("no of spaces in given string:"+  count);
		
	}

}
