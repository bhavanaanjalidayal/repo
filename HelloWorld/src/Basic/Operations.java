package Basic;
public class Operations
{
	
	Operations(int a ,int b)
	{
		System.out.println(a);
		int c = a+b;
		System.out.println(c);
	}
	
	public static double multiply(int r)
	{
		double d = 22.0/7*r*r;
		System.out.println(d);
		return d;
	}
public static void main(String args[])
	{
		Operations d = new Operations(1,3);
System.out.println("Heloo");
multiply(10);
//int c = x+y;
//System.out.println(c);
		
	}
}
;