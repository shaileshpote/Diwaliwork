package logicalprogram;

import java.util.Scanner;

public class example17
{
	public static void main(String[]args)
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter no :  ");
		
		      int num = scan.nextInt();
		
		int fact=1 ;
		
		for ( int i = num ; i>=1 ; i--   )
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
		
	}

}
