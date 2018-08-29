package Basic;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		if(scan.hasNext())
{
	System.out.println(scan.nextInt());
}
		}
}
