package MercuryTours;

public class UnderstandingForLoop {

	static int a=0; 
	static int b=1;
	private static int sum1;
	static int c,d;
	public static void main(String args[])
	{
		
		int sum= 0;
		System.out.print(a+" "+b);
		for(int i =0;i<10;++i)
		{
			
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			
		}
		System.out.println();
		for(int i =0;i<10;i++)
		{
			
			sum1=c+d;
			System.out.print(" "+sum);
			c=d;
			d=sum1;
			
		}
	}
	
}
