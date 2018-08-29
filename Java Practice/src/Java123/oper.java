package Java123;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

//import org.omg.Messaging.SyncScopeHelper;

public class oper {

	public static void main(String[] args) {
		
//			int x=11;
//			System.out.println(x++);//12
//			System.out.println(++x);//12
//			System.out.println(x--);//11
//			System.out.println(--x);//11
//		
//				int a=10;  
//				int b=10;  
//				System.out.println(a++ + ++a);//10+12=22  
//				System.out.println(b++ + b++);//10+11=21  
//				  
//				 a=20;  
//				 b=-33;  
//				boolean c=true;  
//				boolean d=false;  
//				System.out.println(~a);//-11 (minus of total positive value which starts from 0) -21  
//				System.out.println(~b);//9 (positive of total minus, positive starts from 0)  32
//				System.out.println(!c);//false (opposite of boolean value)  
//				System.out.println(!d);//true
//		int age = 14,n=1;
//		System.out.println( ((n & 1) == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");
//		System.out.println( (age<13 || (13<=age && age<18) )? "You are young" : "You are a teenager..");
//		  if(age<13)
//	            System.out.println("You are young");
//		  else if(age>13 && age<=18)
//	            System.out.println("You are a teenager");
//	        else if(age>18)
//	            System.out.println("You are old");
	//***********************************************************************************************************************	
//		        Scanner scan1 = new Scanner(System.in);
//		        int testCases = scan1.nextInt();
//		        for(int i = 0; i < testCases; i++){
//		            char[] inputString = scan1.next().toCharArray();
//		            StringBuilder oddString = new StringBuilder();
//		            StringBuilder evenString = new StringBuilder();
//					
//		            for(int j = 0; j < inputString.length; j++) {
//		                if( (j & 1) == 0) {
//		                    evenString.append(inputString[j]);
//		                }
//		                else {
//		                    oddString.append(inputString[j]);
//		                }
//		            }
//		            
//		            System.out.println(evenString + " " + oddString);
//		        }
//		     scan1.close();
//************************************************************************************************************************8*		   
//		int[] awe = new int[10];
//				for(int j =0;j<10;j++)
//				{
//					
//					Scanner scan = new Scanner(System.in);
//					awe[j]=scan.nextInt();
//					System.out.println(awe[j]);
//				}
//				int temp = 0;
//				for(int i =0;i<10;i++)
//				{
//					temp=temp+awe[i];
//				}
//				System.out.println(temp/awe.length);
				
	//*********************************************************************************************************			
				
				Scanner s1 = new Scanner(System.in);
				int t = s1.nextInt();
				
				//HashMap<String, Integer> cache = new HashMap<String, Integer>();
				Hashtable<String, Integer> source = new Hashtable<String,Integer>();
				HashMap<String, Integer> map = new HashMap(source);
				
				for(int i =0;i<t;i++)
				{
					
					String name = s1.next();
					int number = s1.nextInt();
					map.put(name,number);
					
							
				}
				for(int j=0;j<t;j++)
				{
					String w = s1.next();
				
					if(map.get(w) == null)
					{
						System.out.println("Not Found");
					}
					else if(map.get(w) != null)
					{
						System.out.println(w+" "+map.get(w));
					}
				}
				
				
				s1.close();
	}

}
