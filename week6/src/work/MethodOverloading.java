package work;

public class MethodOverloading {

	public static double add(double a, double b, double c) {
		return (a + b + c);
	}

	public static double multiply(double a, double b, double c) {
		return (a * b * c);
	}

	public static void main(String[] args) {

		double userInput1 = 0;
		double userInput2 = 0;
		double userInput3 = 0;

		add(userInput1, userInput2, userInput3);
		multiply(userInput1, userInput2, userInput3);

	}
}
