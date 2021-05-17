package javapractices2;

import java.util.Scanner;

public class JavaCalculator {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
				"main menu \nselect an option \n1 for addition \n2 for multiplication \n3 for subtraction \n4 for division \n0 to exit ");
		String selection = "";
		while (!selection.equals("0")) {
			selection = scanner.nextLine();

			if (selection.equals("1")) {

				add();
			} else if (selection.equals("2")) {
				mult();
			} else if (selection.equals("3")) {
				sub();
			} else if (selection.equals("4")) {
				div();
			}

//		add(3, 5);
//		mult(5, 6);
//		sub(10, 3);
//		div(30,4);
		}
	}

	public static int add() {
		System.out.println("enter first value to add");
		int valuea = scanner.nextInt();
		System.out.println("enter second value add");
		int valueb = scanner.nextInt();
		int answer = valuea + valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		System.out.println(
				"main menu \nselect an option \n1 for addition \n2 for multiplication \n3 for subtraction \n4 for division \n0 to exit ");
		return answer;

	}

	private static int mult() {
		System.out.println("enter first value to multiply");
		int valuea = scanner.nextInt();
		System.out.println("enter second value to multiply");
		int valueb = scanner.nextInt();
		int answer = valuea * valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		System.out.println(
				"main menu \nselect an option \n1 for addition \n2 for multiplication \n3 for subtraction \n4 for division \n0 to exit ");
		return answer;
	}

	private static int sub() {
		System.out.println("enter first value for subtraction");
		int valuea = scanner.nextInt();
		System.out.println("enter second value for subtraction");
		int valueb = scanner.nextInt();
		int answer = valuea - valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		System.out.println(
				"main menu \nselect an option \n1 for addition \n2 for multiplication \n3 for subtraction \n4 for division \n0 to exit ");
		return answer;
	}

	private static void div() {
		System.out.println("enter first value for division");
		double valuea = scanner.nextInt();
		System.out.println("enter second value for division");
		double valueb = scanner.nextInt();
		if (valuea < valueb) {
		double answer = valuea / valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		System.out.println(
				"main menu \nselect an option \n1 for addition \n2 for multiplication \n3 for subtraction \n4 for division \n0 to exit ");
	}
		else  { System.out.println("sorry this cannot be completed");
		System.out.println("                                ");
		System.out.println("main menu \nselect an option \n1 for addition \n2 for multiplication \n3 for subtraction \n4 for division \n0 to exit ");
	}

}}