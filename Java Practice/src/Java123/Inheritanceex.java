package Java123;

import java.util.Scanner;

public class Inheritanceex {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
		
	}

}

class Student extends Person1{
	private int[] testScores;
	String firstName;
	String lastName;
	int id;
Student(String firstName,String lastName,int id,int[] scores)
{
	super(firstName,lastName,id);
this.firstName = firstName;
this.lastName = lastName;
this.id = id;
testScores = scores;

}
    char calculate()
    { char c = 0;
        int temp = 0;
        for(int i =0;i<testScores.length;i++)
        {
            temp = temp + testScores[i];
        }
       double a = temp/testScores.length;
       
       if(a>=90 && a<=100)
           c = 'O';
           
        else if(a>=80 && a<90)
            c = 'E';
           
        else if(a>=70 && a<80)
            c = 'A';
        else if (a>=55 && a<70)
            c = 'P';
        else if (a>=40 && a<55)
            c ='D';
        else if (a<40)
            c = 'T';
        return c;
    }
}
    
    class Person1 {
    	protected String firstName;
    	protected String lastName;
    	protected int idNumber;
    	
    	// Constructor
    	Person1(String firstName, String lastName, int identification){
    		this.firstName = firstName;
    		this.lastName = lastName;
    		this.idNumber = identification;
    	}
    	
    	// Print person data
    	public void printPerson(){
    		 System.out.println(
    				"Name: " + lastName + ", " + firstName 
    			+ 	"\nID: " + idNumber); 
    	}
    	int computeDifference()
    	{
    		
    	int[] elements = {1,2,5};
    	     int temp=elements[0];
    	    int compare[] = new int[elements.length];
    	    for(int i= 1;i<elements.length;i++)
    	    {
    	       compare[i] = temp - elements[i];
    	    }
    	    int maximumDifference = compare[0];
    	    for(int j =1;j<compare.length;j++)
    	    {
    	        if(maximumDifference<compare[j])
    	        {
    	            maximumDifference = compare[j];
    	        }
    	    }
    	    
    	 return maximumDifference;
    	}
    }

    
    