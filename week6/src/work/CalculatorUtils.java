package work;

public class CalculatorUtils {
	public static double add(double a, double b) {
		return (a + b);
	}

	public static double subtract(double a, double b) {
		return (a - b);
	}

	public static double divide(double a, double b) {
		return (a / b);
	}

	public static double multiply(double a, double b) {
		return (a * b);
	}

	public static void main(String[] args) {
		double usersInput1 = 0;
		double usersInput2 = 0;

		add(usersInput1, usersInput2);
		subtract(usersInput1, usersInput2);
		divide(usersInput1, usersInput2);
		multiply(usersInput1, usersInput2);
	}
}
