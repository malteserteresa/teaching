package work;

import java.util.Scanner;

public class HelloPlanets {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] planet = { "Pluto", "Mars", "Jupiter", "Saturn", "Neptune", "Mercury", "Earth", "Venus", "Uranus" };

		for (String choice : planet) {
			System.out.println("Hello " + choice);
		}
		scanner.close();
	}

}
