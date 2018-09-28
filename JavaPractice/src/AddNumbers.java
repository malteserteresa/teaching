
// write a program to print the sum of two numbers
import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input your fist number: ");
		int number1 = scanner.nextInt();
		System.out.println("input your second number: ");
		int number2 = scanner.nextInt();
		int sum = number1 + number2;
		System.out.println();
		System.out.println("sum: " + sum);
		scanner.close();
	}
}
