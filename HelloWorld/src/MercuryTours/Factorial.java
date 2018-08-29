package MercuryTours;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Factorial {
    static int fact = 1;
    static int factorial(int n) {
    	if(n>=1)
    	{
        fact = fact * n;
        n--;
        factorial(n);
       
    	}
    	 return fact;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}