package Java123;

public class TRYCATCH {

	public static void main(String args[])
	{

		  try {
		   int d = 0;
		   int n = 20;
		   int fraction = n / d;
		   int g[] = {
		    1
		   };
		   g[18] = 100;
		  }
		//  catch(Exception e){
//		  	System.out.println("In the catch clock due to Exception = "+e);
		//  }
		  catch (ArithmeticException e) {
		   System.out.println("In the catch clock due to Exception = " + e);
		  } catch (ArrayIndexOutOfBoundsException e) {
		   System.out.println("In the catch clock due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
		 
		
		
		
	}
	void new1234() throws InterruptedException
	{
		
		
		
	}
	
}
