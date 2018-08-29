package Java123;
import java.util.Scanner;

public class primenumber {

	public int Primenumber(int a)
	{ 
		boolean isPrime=true;
	int temp;
	
		for(int i=2;i<=a/2;i++)
		{
			temp =a%i;
			if(temp==0){
				isPrime=false;
				break;
			}
			
			
		}
		if(isPrime==true)
		{
			System.out.println(a+" is a prime nubmer");
		}
		else
			System.out.println(a+" is not a prime number");
		
		return a;
		
		
	}
	
	
	public double positive(double b)
	{
		if(b<0)
			System.out.println(b+" is a negative number");
		return b;
	}
	
	public void first100prime()
	{
	      
	       for(int i=1;i<=100;i++)
	       {
	    	   boolean flag = true;
	    	   for(int j=2;j<i-1;j++)
	    	   {
	    		   if(i%j==0)
	    		   {
	    			   flag=false;
	    			   break;
	    		   }
	    		   
	    	    }
	    	   if(flag==true)
	    	   {
	    		   System.out.print(i+" ");
	    	   }
	    	  
	    	   
	       }
	       
	}
	public void Twoto30()
	{
		for(int i=2;i<=30;i++)
		{
			boolean flag= true;
			for(int j=2;j<29;j++)
			{
				if(i%j==0)
				{
					break;
				}
				
			}
			if(flag ==true)
			{
				
			}
		}
	}
	 int i[] = {0};
	 
	public static void main(String args[])
	{
//		primenumber p = new primenumber();
//		Scanner s = new Scanner(System.in);
//		p.positive(s.nextDouble());
//		p.Primenumber(12);
//		p.Primenumber(13);
//		p.first100prime();
//		int x=11;
//		System.out.println(x++);//11
//		System.out.println(++x);//13
//		System.out.println(x--);//13
//		System.out.println(--x);//11
//		 int a=20;  
//		int b=-33;  
//		boolean c=true;  
//		boolean d=false;  
//		System.out.println(~a);//-11 (minus of total positive value which starts from 0) -21  
//		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  32
//		System.out.println(!c);//false (opposite of boolean value)  
//		System.out.println(!d);//true
//		
//		System.out.println(10<<2);//10*2^2=10*4=40  
//		System.out.println(10<<3);//10*2^3=10*8=80  
//		System.out.println(20<<2);//20*2^2=20*4=80  
//		System.out.println(15<<4);//15*2^4=15*16=240  
		  
//		      if(args.length> 0)
//		         System.out.println(args.length);
		   
		
//    int i[] = {1};
//    change_i(i);
//    System.out.println(i[0]);
// }
// public static void change_i(int i[]) {
//     i[0] = 2;
//     i[0] *= 2;
//    //System.out.println(i[0]);
 
	
}}
