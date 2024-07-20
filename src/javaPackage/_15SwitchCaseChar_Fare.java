package javaPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class _15SwitchCaseChar_Fare 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		
		double fare = 0.0;
		String passengerTypeStr = "", businessClassStr = "";
		String passengerType = "", businessClass = "";
		double discountRate = 0.0, businessClassCharge = 0.0;
		double discount = 0.0, newFare = 0.0;
		
		//Fare
		System.out.print("Enter fare: ");
		fare = input.nextDouble();
		
		//Passenger Type
		System.out.print("\nPassenger type [O: Ordinary, S: Student, C: Senior Citizen]: ");
		passengerTypeStr = input.next();
		passengerTypeStr = passengerTypeStr.toUpperCase();
		
		char passengerTypeChar = passengerTypeStr.charAt(0);
		switch (passengerTypeChar)
		{
			case 'O': passengerType = "Ordinary";
							discountRate = 0;
							businessClassCharge = 1000;
							break;
			case 'S': passengerType = "Student";
							discountRate = 0.05;
							businessClassCharge = 700;
							break;
			case 'C': passengerType = "Senior Citizen";
							discountRate = 0.1;
							businessClassCharge = 500;
							break;
			default: passengerType = "0";
							discountRate = 0;
							businessClassCharge = 0;
		}
		
		//Business Class
		System.out.print("\nTravelling in business class? [Y/N]: ");
		businessClassStr = input.next();
		businessClassStr = businessClassStr.toUpperCase();
		
		char businessClassChar = businessClassStr.charAt(0);
		switch (businessClassChar)
		{
			case 'Y': businessClass = "Y";
							break;
			case 'N': businessClass = "N";
							businessClassCharge = 0;
							break;
			default: businessClass = "0";
		}
		
		//Computation formulas
		discount = fare * discountRate;
		newFare = (fare - discount) + businessClassCharge;
				
		//Display output
		System.out.println("\n\nDiscount: " + df.format(discount));
		System.out.println("Business class charge: " + df.format(businessClassCharge));
		System.out.println("New fare: " + df.format(newFare));
	}
	
}
