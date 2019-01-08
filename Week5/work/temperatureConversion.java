package work;

import java.util.Scanner;

public class temperatureConversion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit");
		double fahrenheit = scanner.nextDouble();
		double tempOfFahrenheit = convertToCelsius(fahrenheit);
		System.out.println(tempOfFahrenheit);

		System.out.println("Enter temp in celsius");
		double celsius = scanner.nextDouble();
		double tempOfCelsius = convertToFahrenheit(celsius);
		System.out.println(tempOfCelsius);
		scanner.close();
	}

	public static double convertToCelsius(double fahrenheit) {
		double convertedfahrenheit = ((fahrenheit - 32) * 5 / 9);
		return convertedfahrenheit;
	}

	public static double convertToFahrenheit(double celsius) {
		double convertedcelsius = ((celsius * 9 / 5) + 32);
		return convertedcelsius;

	}

}