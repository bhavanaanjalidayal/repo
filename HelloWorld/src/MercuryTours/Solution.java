package MercuryTours;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int smallest = 0;
	static int fact = 1;
    static int largest = 0;
    static int[]  s= {12,1,13,2,32,56,45};
    static int factorialRecursion(int n) {
    	if(n>=1)
    	{
        fact = fact * n;
        n--;
        factorialRecursion(n);
       
    	}
    	 return fact;
    }
    
    static void factForLoop(int no)
    {
    	for(int i=1;i<=no;i++)
    	{
    		fact = fact*i;
    	}
    	System.out.println(fact);
    }
    
 public static void largesmall()
 {
	 largest = s[0];
	 smallest=s[0];
	 for(int i=0;i<s.length;i++)
	 {
		
		 if(s[i]>largest)
			largest = s[i];
		 if(s[i]<smallest)
			 smallest = s[i];
		
	 }
	 System.out.println(largest+" "+smallest);
 }
 static double rno = 0;
 public static void reverse(int r)
 {
	 for(int i =1;r>0;i++)
	 {
	int e = r%10;
	rno = rno*10 + e;
	r=r/10;
	 }
	 
 }
 
 public static void pyramid(int w)
 {
	
	 for(int j=w;j>0;j--)
	 {
	 for( int i =1;i<=j;i++)
	 {
		System.out.print(i);
		
	 }
	 
	 System.out.println();
	 
 }
	 }
 public static void t() {
 int i =0;   
 
 do
 {
   System.out.println("i is : " + i);
   i++;
   
 }while(i < 5);
 }


    public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int result = factorialRecursion(n);
//    System.out.println(result);
//    
//    	largesmall();
//    	
//    	factForLoop(10);
	//pyramid(10);
    	//t();
	
	  Scanner in = new Scanner(System.in);
      //int n = in.nextInt();
      int[] arr = new int[2];
      for(int i=0; i < 2; i++){
          arr[i] = in.nextInt();
      }
      in.close();
      for(int j=1;j>=0;j--)
      {
      System.out.print(arr[j]+" ");
      }
    }
}
