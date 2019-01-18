package work;

import java.io.FileInputStream;
import java.util.Scanner;

public class MarkChecker {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new FileInputStream("Marks.txt"));
		int counter = 0;
		int total = 0;
		while (scanner.hasNextLine()) {
			counter = counter + 1;
			String nextLine = scanner.nextLine();
			System.out.println("Mark is: " + nextLine);
			int temp = Integer.parseInt(nextLine);
			total = total + temp;
		}

		System.out.println("Number of marks in file is " + counter);
		System.out.println("Total marks in class: " + total);
		scanner.close();
	}
}
