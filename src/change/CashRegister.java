package change;

import java.util.Scanner;

public class CashRegister {
	public static Scanner register = new Scanner(System.in);
	public static float total, cash;
	public static int startchange, change;

	public static void main(String[] args) {
		int option;

		while (true) {
			System.out.println("-----CASH REGISTER MENU-----");
			System.out.println("Press 1 for new transaction");
			System.out.println("Press 2 to close register");
			System.out.println("----------------------------");
			option = register.nextInt();

			if (option == 2) {
				break;
			}
			;

			if (option == 1) {
				System.out.print("What is the total of the items?\n" + "$");
				total = register.nextFloat();
				System.out.print("How much cash did the customer give?\n" + "$");
				cash = register.nextFloat();
				change = (int) ((cash * 100) - (total * 100));
				startchange = change;
				if (cash < total) {
					System.out.println("***Not enough cash!*** \nRemaining Balance: \n $" + -(change / 100F));
				}
				;
				if (cash == total) {
					System.out.println("Exact change!");
				}
				;
				if (cash > total) {
					System.out.println("--------------------- \n Change due: \n $" + (change / 100F) + "\nGive:");
				}
				;
				int twentydollars = 0, tendollars = 0, fivedollars = 0, onedollars = 0, quarters = 0, dimes = 0,
						nickels = 0, pennies = 0;
				if (change >= 2000) {
					twentydollars = change / 2000;
					if (twentydollars == 1) {
						System.out.println(twentydollars + " twenty");
					} else if (twentydollars > 1) {
						System.out.println(twentydollars + " twenties");
					}
				}
				change = startchange - (twentydollars * 2000);
				if (change >= 1000) {
					tendollars = change / 1000;
					if (tendollars == 1) {
						System.out.println(+tendollars + " ten");
					} else if (tendollars > 1) {
						System.out.println(tendollars + " tens");
					}
				}
				change = startchange - ((twentydollars * 2000) + (tendollars * 1000));

				if (change >= 500) {
					fivedollars = change / 500;
					if (fivedollars == 1) {
						System.out.println(fivedollars + " five");
					} else if (tendollars > 1) {
						System.out.println(fivedollars + " fives");
					}
				}

				change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500));

				if (change >= 100) {
					onedollars = change / 100;
					if (onedollars == 1) {
						System.out.println(onedollars + " one");
					} else if (onedollars > 1) {
						System.out.println(onedollars + " ones");
					}
				}

				change = startchange
						- ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500) + (onedollars * 100));
				// here
				if (change >= 25) {
					quarters = change / 25;
					if (quarters == 1) {
						System.out.println(quarters + " quarter");
					} else if (quarters >= 1) {
						System.out.println(quarters + " quarters");
					}
				}

				change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500)
						+ (onedollars * 100) + (quarters * 25));

				if (change >= 10) {
					dimes = change / 10;
					if (dimes == 1) {
						System.out.println(dimes + " dime");
					} else if (dimes > 1) {
						System.out.println(dimes + " dimes");
					}
				}

				change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500)
						+ (onedollars * 100) + (quarters * 25) + (dimes * 10));

				if (change >= 5) {
					nickels = (change / 5);
					Math.floor(nickels);
					if (nickels == 1) {
						System.out.println(nickels + " nickel");
					} else if (nickels > 1) {
						System.out.println(nickels + " nickels");
					}
				}

				change = startchange - ((twentydollars * 2000) + (tendollars * 1000) + (fivedollars * 500)
						+ (onedollars * 100) + (quarters * 25) + (dimes * 10) + (nickels * 5));

				if (change >= 1) {
					pennies = change;
					if (pennies == 1) {
						System.out.println(pennies + " penny");
					} else if (pennies > 1) {
						System.out.println(pennies + " pennies");
					}
				}
				System.out.println();

			}
			;
			if (option != 1) {
				System.out.println("Invalid option!");

			}
			;

		}
	}
}

// }
//
//
//

//

//
// }
