package Java123;

import java.util.Scanner;

public class Binary {

	public static void main(String args[])
	{
		int y = 300;
		System.out.println(Integer.toBinaryString(y));
		char t[] = Integer.toBinaryString(y).toCharArray();
		int temp=0;
		for(int i =0;i<t.length;i++)
		{
		
		if(t[i]=='1')
		{
			temp=temp+1;
		}
		
		}
		//System.out.println(temp);
		
		//TwoDArray();
		HackerTwoArray();
	}
	
	
	static void TwoDArray()
	{
		//int[][] e = new int[3][2];
		int [][] e = {{2,3},{1,2},{3,4}};
		int [][] d = {{1},{2},{3},{4},{5}};
		for(int i =0;i<5;i++)
		{
			
			if(i<3)
			for(int j=0;j<2;j++)
			{
				
				System.out.print(e[i][j]+" ");
			}
			if(i<=4)
				System.out.println("value of d = "+d[i][0]);
		}
	}
	
	static void HackerTwoArray()
	{
		int[][] t = new int[6][6] ;
		Scanner in = new Scanner(System.in);
		for(int j=0;j<=5;j++)
		{
		for(int i=0;i<=5;i++)
		{
			
			t[j][i]= in.nextInt();
			//System.out.print(" ");
		}
		//System.out.println();
		
		
		}
		System.out.println("PRINTING INPUT ARRAY*******************");
		
//		for(int k=0;k<=5;k++)
//		{
//			for(int h = 0;h<=5;h++)
//			{
//				System.out.print(t[k][h]+" ");
//			}
//			System.out.println();
//		}
		int s = 0;
		for(int r =0;r<4;r++)
		{
			for(int y=0;y<4;y++)
			{
				
				int sum= t[r][y]+t[r][y+1]+t[r][y+2]+
						t[r+1][y+1]+
						t[r+2][y]+t[r+2][y+1]+t[r+2][y+2];
				//System.out.println("Sum of hourglass "+r+" "+y+" = "+sum);
				if(sum>s)
				{
					s = sum;
				}
				
			}
		
		}
		System.out.println("Highest = "+s);
	}
	
}
