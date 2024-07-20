package javaPackage;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _14LogicalOperators_SalesDiscount1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		
		String product = "";
		double price = 0.0;
		double discount = 0.0, netPrice = 0.0;
		
		System.out.print("Enter product: ");
		product = input.nextLine();
		System.out.print("\nEnter Price: ");
		price = input.nextDouble();
		
		if (price >= 0 && price <= 10000)
		{
	            discount = price * 0;
	            netPrice = price - discount;
		} 
		else if (price >= 10001 && price <= 20000) 
		{
			 discount = price * 0.05;
			 netPrice = price - discount;
		} 
		else if (price >= 20001 && price <= 50000) 
		{
	            discount = price * 0.1;
	            netPrice = price - discount;
		} 
		else if (price >= 50001 && price <= 100000) 
		{
	            discount= price * 0.15;
	            netPrice = price - discount;
		} 
		else if (price > 100000) 
		{
	            discount = price * 0.2;
	            netPrice = price - discount;
		} 
        else 
		{
	            System.out.println("Error");
		}
        System.out.println("\n\nPrice of " + product + " is " + df.format(price));
        System.out.println("Discount is " + df.format(discount));
        System.out.println("Net Price is " + df.format(netPrice));
	}

}


