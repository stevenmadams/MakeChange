package change;

import java.util.Scanner;

public class CashRegister {
	public static Scanner register = new Scanner(System.in);
	public static float total, cash, change;

	public static void main(String[] args) {

		float total = 0.0F;
		float cash = 0.0F;
		
		int change = 0;
		int startchange = 0;

		// 1. The user is prompted asking for the total of the item.
		System.out.print("What is the total of the item?\n" + "$");
		total = register.nextFloat();

		// 2 .The user is then prompted asking how much money was tendered by
		// the customer
		System.out.print("How much cash did the customer give?\n" + "$");
		cash = register.nextFloat();

		change = (int) ((cash*100) - (total*100));
		startchange = change;

		System.out.println("Change due: \n $" + (change/100F));
		
		// 3. Display an appropriate message if the customer provided too little
		// money or the exact amount
		
		if (cash < total) {
			System.out.println("Not enough cash!");
		}
		;
		if (cash == total) {
			System.out.println("Exact change!");
		}
		;

// 4. If the amount tendered is more than the cost of the item, display
// the number
// of bills and coins that should be given to the customer

		int twentydollars = 0, tendollars = 0, fivedollars = 0, onedollars = 0;
		int quarters = 0, dimes = 0, nickels = 0, pennies = 0;

		if (change >= 2000) {
			twentydollars = change / 2000;
			if (twentydollars == 1) {
				System.out.println("Give " + twentydollars + " twenty");
			} 
			else if (twentydollars > 1) {
				System.out.println("Give " + twentydollars + " twenties");
			}
		}
		

		change = startchange - (twentydollars * 2000);
		
		if (change >= 1000) {
			tendollars = change / 1000;
			if (tendollars == 1) {
				System.out.println("Give " + tendollars + " ten");
			} 
			else if (tendollars > 1) {
				System.out.println("Give " + tendollars + " tens");
			}
		}

		change = startchange - ((twentydollars * 2000) + (tendollars * 1000));

		if (change >= 500) {
			fivedollars = change / 500;
			if (fivedollars == 1) {
				System.out.println("Give " + fivedollars + " five");
			} 
			else if (tendollars > 1) {
				System.out.println("Give " + fivedollars + " fives");
			}
		}

		change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500));

		if (change >= 100) {
			onedollars = change / 100;
			if (onedollars == 1) {
				System.out.println("Give " + onedollars + " one");
			} 
			else if (onedollars > 1) {
				System.out.println("Give " + onedollars + " ones");
			}
		}
		

		change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500) + (onedollars * 100));

		if (change >= 25) {
			quarters = change/ 25;
			if (quarters == 1) {
				System.out.println("Give " + quarters + " quarter");
			} 
			else if (quarters >= 1) {
				System.out.println("Give " + quarters + " quarters");
			}
		}

		change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500) + (onedollars * 100)
				+ (quarters * 25));

		if (change >= 10) {
			dimes = change / 10;
			if (dimes == 1) {
				System.out.println("Give " + dimes + " dime");
			} 
			else if (dimes > 1) {
				System.out.println("Give " + dimes + " dimes");
			}
		}

		change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500) + (onedollars * 100)
				+ (quarters * 25) + (dimes * 10));

		if (change >= 5) 
		{
			nickels = (change / 5);
			Math.floor(nickels);
			if (nickels == 1) {
				System.out.println("Give " + nickels + " nickel");
			} 
			else if (nickels > 1) {
				System.out.println("Give " + nickels + " nickels");
			}
		} 
		
		change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500) + (onedollars * 100)
				+ (quarters * 25) + (dimes * 10) + (nickels * 5));
		
		if ( change >= 1){
			pennies = change;
			if (pennies == 1){
				System.out.println("Give " + pennies + " penny");
			} 
			else if (pennies > 1) {
				System.out.println("Give " + pennies + " pennies");
			}
		
	}
	}
}




