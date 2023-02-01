package logicalprogram;

public class example47
{
	public static void main(String[]args)
	{
		
		int num= 5;
		
		int count = 0 ;
		
		for(int i = 2 ; i<num ; i++)
		{
			
			if(num%i==0)
				
			{
				count++;
				break;
				
			}
			
		}
		
		if(count==num)
		{
			System.out.println(" number is prime");
		}
		else
		{
			System.out.println(" number is not prime");
		}
		
		
		
		
		
		
		
		
		
	}

}
