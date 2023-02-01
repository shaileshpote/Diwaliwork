package logicalprogram;

public class example27 
{
public static void main(String[]args)
{
	String org="madam";
	
	String rev = " ";
	
	for ( int i= org.length()-1 ; i>=0 ; i--)
	{
		rev= rev+org.charAt(i);
		
	}
	
	System.out.print("original string :" + org);
	
	System.out.print(" reverse string :" + rev);
	

	if(org.equals(rev))
	{
		System.out.println("given string is pallindrome");
	}
	else
	{
		System.out.println("given string is not pallindrome");
	}
	
	
	
	
	
	
	
	
	
}
}
