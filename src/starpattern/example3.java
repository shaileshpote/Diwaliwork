package starpattern;

public class example3
{
	public static void main(String[]args)
	{
		int Star=5;
		
		for(int i = 1 ; i<= 4 ; i++)
		{
			for (int j =1 ; j<=Star ; j++)
			{
				
				System.out.print("*");
			}
		
			
		System.out.println();
		Star=Star-2;
		}
		
	}

}
