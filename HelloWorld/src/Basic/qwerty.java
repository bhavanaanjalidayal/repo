package Basic;
public class qwerty {

   int empId;  
   String empName;  
	    
   //parameterized constructor with two parameters
   qwerty(int id, String name){  
       this.empId = id;  
       this.empName = name;  
       int a =10;
       int b= 20;
       System.out.println(a+b);
   }  
   void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  
	   
   public static void main(String args[]){  
	qwerty obj1 = new qwerty(10245,"Chaitanya");  
	qwerty obj2 = new qwerty(92232,"Negan");  
	obj1.info();  
	obj2.info();  
   }  
}