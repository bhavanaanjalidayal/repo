package MercuryTours;

import java.util.Scanner;

public class LargeSmall1 {
	static int[] b = null;
static	int[] a = {23,12,3,4,122,45,67};
	static int largest = a[0];
	static int smallest = a[0];
	
	public static void large()
	{
		
		for(int i =1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			
			if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
	
	
	public static void main(String args[])
	{
		
		Scanner in =new Scanner(System.in);
		for(int i =0;i<=2;i++)
		{
		//in.nextInt() = b[i];
		}

		for(int j=0;j<=2;j++)
		{
			System.out.println(b[j]);
		}
		large();
	}
}
