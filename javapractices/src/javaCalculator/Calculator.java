package javaCalculator;

import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);

	public static int add() {
		System.out.println("enter first value to add");
		int valuea = scanner.nextInt();
		System.out.println("enter second value add");
		int valueb = scanner.nextInt();
		int answer = valuea + valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

	public static int mult() {
		System.out.println("enter first value to multiply");
		int valuea = scanner.nextInt();
		System.out.println("enter second value to multiply");
		int valueb = scanner.nextInt();
		int answer = valuea * valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

	public static int sub() {
		System.out.println("enter first value for subtraction");
		int valuea = scanner.nextInt();
		System.out.println("enter second value for subtraction");
		int valueb = scanner.nextInt();
		int answer = valuea - valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

	public static double div() {
		System.out.println("enter first value for division");
		double valuea = scanner.nextInt();
		System.out.println("enter second value for division");
		double valueb = scanner.nextInt();
		double answer = valuea / valueb;

		System.out.println("the answer is " + answer);
		System.out.println("                                ");
		return answer;
	}

}