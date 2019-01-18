import java.util.Scanner;

public class LotteryNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int firstNumber = 9;
		int secondNumber = 8;
		int thirdNumber = 7;
		int fourthNumber = 6;

		System.out.println("Please enter first number");
		int num1 = scanner.nextInt();

		while (num1 > 99 || num1 < 1) {
			System.out.println("enter number again");
			num1 = scanner.nextInt();
		}

		System.out.println("please enter another number");
		int num2 = scanner.nextInt();

		while (num2 > 99 || num2 < 1) {
			System.out.println("enter number again");
			num2 = scanner.nextInt();
		}

		System.out.println("please enter another number");
		int num3 = scanner.nextInt();

		while (num3 > 99 || num3 < 1) {
			System.out.println("enter number again");
			num3 = scanner.nextInt();
		}

		System.out.println("please enter another number");
		int num4 = scanner.nextInt();

		while (num4 > 99 || num4 < 1) {
			System.out.println("enter number again");
			num4 = scanner.nextInt();
		}

		int match = 0;

		if (num1 == firstNumber) {
			match = match + 1;
		}

		if (num2 == secondNumber) {
			match = match + 1;
		}

		if (num3 == thirdNumber) {
			match = match + 1;
		}

		if (num4 == fourthNumber) {
			match = match + 1;
		}

		if (match == 4) {
			System.out.println();

		}
		scanner.close();
	}
}
