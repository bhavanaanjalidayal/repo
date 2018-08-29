package Java123;

 class Animal {
static int t =90;
	void eat()
	{
		System.out.println("Animal is eating");
	}
	void bark()
	 {
		 System.out.println("Animal is barking");
	
	 }

	
	

}


 class Dog extends Animal
{
	Dog(int y)
	{
		super.t = y;
	}
	 void bark()
	 {
		 System.out.println("Dog is barking");
	
	 }
	 

}
 public class pomerian extends Dog
 {
	 pomerian(int y) {
		super(y);
		// TODO Auto-generated constructor stub
	}


	void color()
	 {
		 System.out.println("pomerian is black");
	
	 } 
	 
	 
	 public static void main(String args[])
	 {
Dog dog = new Dog(t);
Animal animal = new Animal();
pomerian a1 = new pomerian(t);
Animal a2 = new Dog(t);
Animal a3 = new Animal();
dog.bark();
dog.eat();
//dog.color();
//animal.bark();
a1.eat();
a1.bark();
a1.color();
a2.bark();
a3.bark();
 }
 
 
 
 public class Test
 {
	 
	 
	 
	 
	 
	 
		 } 
		
 }
 
 
 

	 



