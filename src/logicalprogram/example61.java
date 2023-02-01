package logicalprogram;

public class example61
{
	public static void main (String[]args)
	{
		String org="madam";
		
		String rev="";
		
		for(int i=org.length()-1 ; i>=0 ; i-- )
		{
			
			rev=rev+org.charAt(i);
		}
		
		System.out.println(org);
		System.out.println(rev);
		
		if(org.equals(rev))
		{
			System.out.println("given string is par ");
		}
		else
		{
			System.out.println(" given string is not par");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
