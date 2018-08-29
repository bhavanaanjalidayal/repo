package Java123;
interface ad
{
	abstract public String method1();
	abstract public void method2();
	String w="cfdew";
	int r=9;
}

interface b
{
	abstract int method3();
}


public class Interface1 implements ad,b{

	public String method1()
	{
		System.out.println(w);
		return w;
	}
	
	public void method2()
	{
		
	}
	
	public int method3()
	{
		System.out.println(r);
		return r;
	}
	
	public static void main(String args[])
	{
		interface123 q = new interface123();
		q.method1();
		q.method2();
		q.method3();
		Interface1 o = new Interface1();
		o.method1();
		o.method2();
		o.method3();
	}
}


 class interface123 implements ad,b
{
	public String method1()
	{
		System.out.println(w+2);
		return w+2;
	}
	
	public void method2()
	{
		
	}
	
	public int method3()
	{
		System.out.println(r+123);
		return r+123;
	}
}