package logicalprogram;

public class example73 
{
	public static void main(String[]args)
	{
		int num=12345678;
		int revnum = 0 ;
		
		for (  int i = num ; i>0 ;i= i/10 )
		{
			int rem= i%10;
			
			revnum=revnum*10+rem;
		}
		
		System.out.println(revnum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
