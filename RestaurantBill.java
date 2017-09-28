package rms;

import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		double mealCost;
		double tax;
		double totalCost;
		
		System.out.println("ente the cost of the meal");
		
	    mealCost = scanner.nextDouble();
	    
	    tax=0.0574*mealCost;
	    totalCost = mealCost + tax;
	    
	    System.out.println(" cost of meal :$" + mealCost);
	    System.out.println("tax : $" + tax);
	    System.out.println("totalCost of meal : $" + totalCost);
	
	 
	 

	}

}
