package inheritance;

public class example2_hirarchilcleinheritance 
{
	
	public static void main(String[]args)
	{
		
		System.out.println("features of son1");
		
		son1 s1=new son1();
		s1.bike();
		s1.car();
		s1.money();
		s1.carf();
		s1.moneyf();
		s1.Landf();
		
		
		
		System.out.println("features of son2");
		
		son2 s2=new son2();
		s2.bike();
		s2.car();
		s2.money();
		s2.carf();
		s2.moneyf();
		s2.Landf();
		
		
		
		System.out.println("features of son3");
		
		son3 s3=new son3();
		
		s3.bike();
		s3.car();
		s3.money();
		s3.carf();
		s3.moneyf();
		s3.Landf();
			
	}

}
