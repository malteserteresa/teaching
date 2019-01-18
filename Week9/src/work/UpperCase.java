package work;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a filename to read from");
		String fileRead = scanner.nextLine();

		System.out.println("Enter a filename to write to");
		String fileWrite = scanner.nextLine();

		PrintWriter writer = new PrintWriter(fileWrite);

		Scanner scanner1 = new Scanner(new FileInputStream(fileRead));

		while (scanner1.hasNextLine()) {
			String nextLine = scanner1.nextLine();
			String upperLine = nextLine.toUpperCase();

			writer.println(upperLine);
		}
		scanner.close();
		writer.close();
		scanner1.close();
	}
}
