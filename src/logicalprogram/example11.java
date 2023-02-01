package logicalprogram;

public class example11
{
	public static void main(String[]args)
	{
		String org= " sapana more ";
		
		String rev = " " ;
		
		for(int i = org.length()-1 ; i>=0 ; i-- )
		
		{ 
			rev=rev+org.charAt(i);
			
		}
		
		System.out.println(rev);	
		
		
	}

}
