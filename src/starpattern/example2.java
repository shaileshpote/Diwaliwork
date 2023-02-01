package starpattern;

public class example2 
{
	public static void main(String[]args)
	{
		int Star=1;
		
		for ( int i = 1 ; i<=6 ; i++ )
		{
			
		  for (int j = 1 ; j<= Star ; j++)
		  {
			
			  System.out.print("*");
		  }
			System.out.println();
			Star=Star+2;
		}
		
		
	}

}
