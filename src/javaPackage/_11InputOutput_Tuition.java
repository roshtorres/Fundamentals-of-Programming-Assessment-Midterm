package javaPackage;
import java.util.Scanner;
import java.text.DecimalFormat;

public class _11InputOutput_Tuition 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		String name = "";
		int units = 0;
		double unitPrice = 0.0;
	
		double totalFee = 0.0;
		double discount_CashPayment = 0.0, _CashPayment = 0.0;
		double penalty_2Installment = 0.0, _2Installment = 0.0;
		double penalty_3Installment = 0.0, _3Installment = 0.0;
		
		System.out.print("Enter name of student: ");
		name = input.nextLine();
		
		System.out.print("Enter number of units enrolled: ");
		units = input.nextInt();
		
		System.out.print("Enter price per unit: ");
		unitPrice = input.nextDouble();
		
		totalFee = units * unitPrice;
		discount_CashPayment = totalFee * 0.1;
		penalty_2Installment = totalFee * 0.05;
		penalty_3Installment = totalFee * 0.1;
		_CashPayment = totalFee - discount_CashPayment;
		_2Installment = totalFee + penalty_2Installment;
		_3Installment = totalFee + penalty_3Installment;
				
		System.out.println();
		System.out.println("Computed Tuition fee: " + df.format(totalFee) + " dollars");
		System.out.println(name + ", you could avail the following payment mode:" );
		System.out.println("\nPayment Mode:");
		System.out.println("Cash Payment: " + df.format(_CashPayment) + " dollars");
		System.out.println("2-installment: " + df.format(_2Installment) + " dollars");
		System.out.println("3-installment: " + df.format(_3Installment) + " dollars");
	}

}
