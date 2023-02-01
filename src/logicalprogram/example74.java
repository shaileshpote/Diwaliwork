package logicalprogram;

public class example74 
{
	public static void main(String[]args)
	{
		int num= 1234;
		int revnum = 0 ;
		
		
		for (int i = num ; i>0 ; i=i/10  )
		{
			
		int remnum = i%10;
		
		revnum=revnum*10+remnum ;
		
		}
		
		System.out.println(revnum);
		
		
		
		
		
		
		
		
		
		
	}

}
