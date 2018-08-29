package Java123;
abstract class A
{
	int r = 12345;
	String e = "fgergfer";
	abstract void new1();

	void new2()
	{
		
	}
}
public class Abstract123 extends A{

	void new1()
	{
		System.out.println("child class of abstract class");
	}
	
	public static void main(String args[])
	{
		Abstract123 j = new Abstract123();
		j.new1();
	}
}
