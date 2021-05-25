package javaCalculator;

import java.util.Scanner;

public class Runner {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int selection = 0;
		boolean cont = true;

		do {
			System.out.println("main menu \nselect an option \n1 for addition \n2 for subtraction "
					+ "\n3 for multiplication \n4 for division \n0 to exit ");
			selection = Integer.parseInt(scanner.nextLine());

			System.out.println("");
			switch (selection) {
			case 1:
				Calculator.add();
				cont = false;
				break;
			case 2:
				Calculator.sub();
				cont = false;
				break;

			case 3:
				Calculator.mult();
				cont = false;
				break;

			case 4:
				Calculator.div();
				cont = false;
				break;

			case 0:
				System.out.println("Exiting. GOODBYE!");
				cont = false;
				break;

			default:
				System.out.println("invalid selection goodbye");
				cont = false;
				break;
			}
		} while (cont);
		scanner.close();
	}

}
