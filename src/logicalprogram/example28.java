package logicalprogram;

public class example28 
{
	public static void main(String[]args)
	{
		int orgnum=150;
		
		int  sum = 0; 
		
		for( int i = orgnum ; i>0 ; i=i/10)
		{
			
			int rem=i%10 ;
			
			sum=sum+(rem*rem*rem);
			
		}
		
		if(orgnum==sum)
		{
			System.out.println("given no"+ orgnum + " s arstrong num");
		}
		else
		{
			System.out.println("given no"+ orgnum + "is not armstrong num");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
