import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int num1;
		num1 = scanner.nextInt();

		System.out.println("Enter a second number");
		int num2;
		num2 = scanner.nextInt();

		System.out.println("Enter a final number");
		int num3;
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num2) {
			System.out.println("The biggest number is: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The biggest number is: " + num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("The biggest number is: " + num3);
		}
		scanner.close();
	}
}
