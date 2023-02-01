package logicalprogram;

public class example39
{
public static void main(String[]args)
{
	
	int orgnum= 153;
	int sum = 0 ;
	
	for(int i = orgnum ; i>0 ; i=i/10   )
		
	{
		int rev = i%10;
		
		sum=sum+(rev*rev*rev);
		
	}
	
	if(orgnum==sum)
	{
		System.out.println("is armstrong ");
	}
	
	else
	{
		System.out.println(" is not armstrong");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
