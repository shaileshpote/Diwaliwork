package logicalprogram;

public class example46 
{
	public static void main ( String[]args)
	{
		int num = 7 ;
		 
		int count= 0 ;
		
		for (int i = 2 ; i<num ; i++)
		{
			if (num % i== 0)
			{
				count++;
				break;
		}
	    }
		
		if(count==num)
		{
			System.out.println(" given number is prime");
		}
		
		else
		{
			System.out.println("given number is not prime");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
