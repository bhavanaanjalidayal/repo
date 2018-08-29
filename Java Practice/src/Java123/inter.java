package Java123;

public class inter {
   int i[] = {0};
   public static void main(String args[]) {
//      int i[] = {1};
//      change_i(i);
//      System.out.println(i[0]);
	   inter n = new inter();
	   n.foo(true,true);
	   class Horse 
       {
       	public String name; /* Line 7 */
       public Horse(String s) 
           {
               name = s;
           }
       } /* class Horse ends */
	    Object obj = new Horse("Zippo"); /* Line 13 */
        Horse h = (Horse) obj; /* Line 14 */
        System.out.println(h.name);
    
   }
   
   public void foo( boolean a, boolean b)
   { 
       if( a ) 
       {
           System.out.println("A"); /* Line 5 */
       } 
       else if(a && b) /* Line 7 */
       { 
           System.out.println( "A && B"); 
       } 
       else /* Line 11 */
       { 
           if ( !b ) 
           {
               System.out.println( "notB") ;
           } 
           else 
           {
               System.out.println( "ELSE" ) ; 
           } 
       }}
   
   
   
   
   public static void change_i(int i[]) {
	   
	   int u;
      int j[] = {2};
      i = j;
      
//      while(2)
//      {
//    	  
//      }
   }
}