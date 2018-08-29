package MercuryTours;

import java.util.Scanner;

public class Stringsep {
	static char a[] = new char[10];
	static char b[] = new char[10];
	static String e= "";
	static String d = "";
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String name = s.next();
		char c[] = name.toCharArray();
		for(int i=0;i<c.length;i+=2)
		{
			System.out.print(c[i]);
		}
		System.out.print(" ");
		for(int j=1;j<c.length;j+=2)
		{
			System.out.print(c[j]);
		}
		
			
	}
}
