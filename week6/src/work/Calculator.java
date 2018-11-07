package work;

import java.util.Scanner;

public class Calculator {

	static void usersOptions(double a, double b) {
		System.out.println("Which method would you like to use? Add, subtract, multiply or divide?");
		String choice = null;
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextLine();
		switch ("choice") {
		case "add":
			CalculatorUtils.add(a, b);
			break;
		case "subtract":
			CalculatorUtils.subtract(a, b);
			break;
		case "divide":
			CalculatorUtils.divide(a, b);
			break;
		case "multiply":
			CalculatorUtils.multiply(a, b);
			break;
		}
		System.out.println("Enter two numbers you wish to use");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number1 = 0;
		double number2 = 0;
		usersOptions(number1, number2);

		System.out.println("Do you wish to do more calculations? yes or no.");
		String answer = scanner.nextLine();
		boolean yes = true;

		if (yes) {
			usersOptions(number1, number2);
		} else {
			System.out.println("GoodBye");
		}
		scanner.close();
	}

}
