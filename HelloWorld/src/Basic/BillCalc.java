package Basic;
import java.util.*;

public class BillCalc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a meal Cost");
        double meal_cost = in.nextDouble();
        System.out.println("Enter the tip percent");
        int tip_percent = in.nextInt();
        System.out.println("Enter the tax percent");
        int tax_percent = in.nextInt();
        double totalCost = totalCost(meal_cost,tip_percent,tax_percent);
        int TOTALCOST = round(totalCost);
        System.out.println("The total meal cost is "+TOTALCOST+" dollars");
        
        in.close();
    }
    public static double totalCost(double meal_cost,int tip_percent,int tax_percent)
    {
        double tip = (meal_cost*tip_percent)/100;
        System.out.println("In totalCost method "+tip);
        double tax = (meal_cost*tax_percent)/100;
        System.out.println("In totalCost method "+tax);
        double totalCost = meal_cost + tip + tax;
        int t = (int) Math.round(meal_cost + tip + tax);
        System.out.println("In totalCost method "+totalCost);
        return totalCost;
    }
    public static int round(double TC)
    {
    	int totalCost = (int)TC;
    	return totalCost;
    }
}