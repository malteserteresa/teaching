package work;

import java.util.Scanner;

public class CalculateMilesPerGallon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] milesTravelled = new int[3];
		milesTravelled[0] = scanner.nextInt();
		milesTravelled[1] = scanner.nextInt();
		milesTravelled[2] = scanner.nextInt();
		int[] gallonsUsed = new int[3];

		/*
		 * for (int i = 0; i < milesTravelled.length; i++) { milesTravelled[i] =
		 * scanner.nextInt(); gallonsUsed[i] = scanner.nextInt(); int mpg =
		 * milesTravelled[i] / gallonsUsed[i]; System.out.println(String.valueOf(mpg));
		 */
		for (int mpg : milesTravelled) {
			System.out.println(String.valueOf(mpg));
		}
		scanner.close();
	}

}
