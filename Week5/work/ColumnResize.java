package work;

import java.util.Scanner;

class ColumnResize {

	static String columnResize(String number) {
		String whiteSpaces = "|" + number;
		for (int i = 1; i <= 11 - number.length(); i++) {
			whiteSpaces = whiteSpaces + " ";
		}
		whiteSpaces = whiteSpaces + "|";
		return whiteSpaces;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println("| number 1 |" + "| number 2 |" + "|   add     |" + "| subtract  |" + "|   times   |"
				+ "|   divide  |");

		System.out.print("|     " + number1 + "    |");

		System.out.print("|     " + number2 + "    |");

		String add = number1 + number2 + "";
		System.out.print(columnResize("" + add + ""));

		String subtract = number1 - number2 + "";
		System.out.print(columnResize(subtract + ""));

		String times = number1 * number2 + "";
		System.out.print(columnResize(times + ""));

		String divide = number1 / number2 + "";
		System.out.print(columnResize(divide + ""));
		scanner.close();
	}
	

}
