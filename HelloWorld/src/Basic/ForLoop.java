package Basic;
import java.util.Scanner;

public class ForLoop {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		do {
			a=a+b;
			System.out.println(a);
		}
		while(a<10 && b<9);
		
	}
}
