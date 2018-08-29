package Java123;

import java.util.Scanner;

class Difference1 {

	private int[] elements;
  	public int maximumDifference;

Difference1(int[] elements)
{
    this.elements = elements;
}
int computeDifference()
{
     int temp=elements[0];
    int compare[] = new int[elements.length];
    for(int i= 0;i<elements.length;i++)
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

public class Diff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

