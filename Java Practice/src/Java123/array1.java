package Java123;

public class array1 {
	

	int[] b = {12,93,2,34,54,81};
	
	public int array2()
	{
		try
		{

		int temp = 0;
		temp=b[0];
		for(int i=1;i<b.length;i++)
		{
			
			if(b[i]>temp)
			{
				temp=b[i];
			}
			
		}
		System.out.println(temp);
		return temp;
		
}
	catch (Exception e)
	{
		e.getMessage();
	}
	int temp = 0;
	return temp;	
	}
	

	
	
	public static void main(String args[])
	{
		array1 w = new array1();
		w.array2();
	}
}

