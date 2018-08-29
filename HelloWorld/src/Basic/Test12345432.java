package Basic;
class Shape
{
	int a,b;
	//CONSTRUCTOR
	Shape(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public void calculateArea()
	{
		
	}
	
	public void noOfShapes()
	{
		System.out.println("4 basic shapes are present");
	}
}

class Rectangle extends Shape
{
	Rectangle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void calculateArea()
	{
		System.out.println(a*b);
	}
	
}

class Test12345432
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(12,14);
		r.calculateArea();
		
		
	}
}