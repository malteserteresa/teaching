package work;

import java.util.Scanner;

class ColumnResize {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println("| number 1 |" + "| number 2 |" + "| add |" + "| subtract |" + "| times |" + "| divide |");

		System.out.print("|" + number1 + "|");
		System.out.print("|" + number2 + "|");
		System.out.print("|" + (number1 + number2) + "|");
		System.out.print("|" + (number1 - number2) + "|");
		System.out.print("|" + (number1 * number2) + "|");
		System.out.print("|" + (number1 / number2) + "|");
	}
}