package javaPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class _16MidtermExam_Cellphone 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		//Variables that will handle inputs
		String product1 = "", product2 = "", product3 = "";
		String price1 = "", price2 = "", price3 = "";
		int cashDiscount = 0, _3MonthsInstallment = 0, _6MonthsInstallment = 0, _12MonthsInstallment = 0;
		String itemAndPriceStr = "", item = "", itemPrice = "";
		int modeOfPayment = 0;
		String mOP = "";
		int _mOP = 0;

		//Variables for computation
		double _Item = 0.0,  _ItemPrice = 0.0;
		double discount = 0.0, discountRate = 0.0, totalAmount = 0.0; 
		double monthly = 0.0;
		
		//Sales Input
		System.out.print("Sales Input:\n");
	
		System.out.print("\nEnter Product 1: ");
		product1 = input.nextLine();
		System.out.print("Enter Price: ");
		price1 = input.nextLine();
		
		System.out.print("\nEnter Product 2: ");
		product2 = input.nextLine();
		System.out.print("Enter Price: ");
		price2 = input.nextLine();
		
		System.out.print("\nEnter Product 3: ");
		product3 = input.nextLine();
		System.out.print("Enter Price: ");
		price3 = input.nextLine();
		
		//Input Mode of Payment Terms
		System.out.print("\nInput Mode of Payment Terms\n");
		
		System.out.print("\nCash Discount (Percent): \t");
		cashDiscount = input.nextInt();
		System.out.print("\tYou input " + cashDiscount + "% " + " for Cash Discount\n");
		
		System.out.print("\n3 Months Installment (Percent): \t");
		_3MonthsInstallment = input.nextInt();
		System.out.print("\tYou input " + _3MonthsInstallment + "% " + " interest for 3 Months Installment\n");
		
		System.out.print("\n6 Months Installment (Percent): \t");
		_6MonthsInstallment = input.nextInt();
		System.out.print("\tYou input " + _6MonthsInstallment + "% " + " interest for 6 Months Installment\n");
		
		System.out.print("\n12 Months Installment (Percent): \t");
		_12MonthsInstallment = input.nextInt();
		System.out.print("\tYou input " + _12MonthsInstallment + "% " + " interest for 12 Months Installment\n");
		
		//Main Menu
		System.out.print("\nMain Menu\n");
		System.out.print("\nPress I: Iphone 12 Pro Max \t$75,000.00");
		System.out.print("\nPress S: Samsung Note 20 \t$76,000.00");
		System.out.print("\nPress X: Xiaomi Black shark \t$35,000.00\n");
		
		System.out.print("\nEnter Item: \t");
		itemAndPriceStr = input.next();
		
		itemAndPriceStr = itemAndPriceStr.toUpperCase();
		
		char itemAndPriceChar = itemAndPriceStr.charAt(0);
		switch (itemAndPriceChar)
		{
			case 'I': item = "Iphone 12 Pro Max";
							itemPrice = "$75,000.00";
							_ItemPrice = 75000;
							break;
			case 'S': item = "Samsung Note 20";
							itemPrice = "$76,000.00";
							_ItemPrice = 76000;
							break;
			case 'X': item = "Xiaomi Black shark";
							itemPrice = "$35,000.00";
							_ItemPrice = 35000;
							break;
			default: item = "Invalid Code";
		}
		
		System.out.println("Your Item is " + item);
		System.out.println("Price: \t" + itemPrice);
		
		//Select Mode of Payment
		System.out.print("\nSelect Mode of Payment\n");
		System.out.print("\nPress 1: Cash \t10% Discount");
		System.out.print("\nPress 2: 3 Months Installment \t5% Interest");
		System.out.print("\nPress 3: 6 Months Installment \t10% Interest");
		System.out.print("\nPress 4: 12 Months Installment \t20% Interest\n");
		
		System.out.print("\nEnter Mode of Payment: \t");
		modeOfPayment = input.nextInt();
		
		switch (modeOfPayment)
		{
			case 1: mOP = "Cash";
							_mOP = 0;
							discountRate = 0.1;
							break;
			case 2: mOP = "3 Months Installment";
							_mOP = 3;
							discountRate = 0.05;
							break;
			case 3: mOP = "6 Months Installment";
							_mOP = 6;
							discountRate = 0.1;
							break;
			case 4: mOP = "12 Months Installment";
							_mOP = 12;
							discountRate = 0.2;
							break;
			default: mOP = "Invalid Code";
		}
		
		System.out.println("Mode of Payment: \t" + mOP);
		
		//Computation formulas
		discount = _ItemPrice * discountRate;
		totalAmount = _ItemPrice + discount;
		monthly = totalAmount/_mOP;
		
		System.out.println("\nItem: " + item);
		System.out.println("Price: " + itemPrice);
		System.out.println("Discount/Interest: " + " $" + df.format(discount));
		System.out.println("Total Amount: " + " $" + df.format(totalAmount));
		System.out.println("Monthly: " +  " $" + df.format(monthly));
	}
	
}