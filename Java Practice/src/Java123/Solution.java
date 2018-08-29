package Java123;

import java.util.Scanner;

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
class Calculator extends Exception
{

	private static final long serialVersionUID = 1L;

	int power(int i,int j) throws NonNegativeException
    {
    if(i<0 || j<0)
     throw new NonNegativeException("n and p should be non-negative");  
        int q = (i^j);
        return q;
    }
}

class NonNegativeException extends Exception{  

	private static final long serialVersionUID = 1L;

NonNegativeException(String s){  
  super(s);  
 }  
}  
