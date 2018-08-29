package Java123;

public class Constructors {
	int w;
	int h ;
	Constructors(int h)
	{
		this.h = h;
	}
	
	Constructors(int a,int b)
	{
		this(2);
		
		
	}
	
	public Constructors cons(Constructors a)
	{
		int d=9;
		System.out.println(h+d);
		Constructors i = new Constructors(100);
		i.cons(this);
		return this;
	}
	public void f()
	{
		
		cons(this);
	}
	
	public static void main(String args[])
	{
		Constructors r = new Constructors(2);
	r.f();
		///
	}

}
