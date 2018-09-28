import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("input first number");
		int number1 = scanner.nextInt();

		System.out.println("input second number");
		int number2 = scanner.nextInt();

		System.out.println(number1 + " x " + number2 + " =  " + number1 * number2);
		scanner.close();
	}
}
