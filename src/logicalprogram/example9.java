package logicalprogram;

public class example9 
{
	public static void main(String[]args)
	{
		String org= "abcd";
		
		String rev= "";
		
		
		for(int i=org.length()-1 ; i>=0 ; i--)
		{
			rev=rev + org.charAt(i);
		}
		
		System.out.println(org);
		System.out.println(rev);
			
	}

}
