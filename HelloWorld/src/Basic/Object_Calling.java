package Basic;
class ABC{  
   public double num = 100;
   public int square(int a){
	return a*a;
   }
}  
public class Object_Calling{
   public static void main(String args[]){  
	ABC obj = new ABC();  
	System.out.println(obj.num); 
	System.out.println(obj.square(10));
   }  
}