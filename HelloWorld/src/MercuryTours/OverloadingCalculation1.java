package MercuryTours;

class OverloadingCalculation1{  
	  void sum(int a,float b){
		  System.out.println(a+b);
		  }  
	  void sum(int a,int b,int c){
		  System.out.println(a+b+c);
		  }  
	  
	  public static void main(String args[]){  
	  OverloadingCalculation1 obj=new OverloadingCalculation1();  
	  obj.sum(20,234567650);//now second int literal will be promoted to long  
	  obj.sum(20,20,20);  
	  
	  }  
	}  
