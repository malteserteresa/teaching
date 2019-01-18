package work;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Enumerate {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new FileInputStream("Rhyme.txt"));
		PrintWriter writer = new PrintWriter("Output-Rhyme.txt");
		int counter = 0;
		while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();
			counter = counter + 1;
			System.out.println(counter + ": " + nextLine);
			writer.println(counter + ": " + nextLine);
		}
		scanner.close();
		writer.close();
	}
}
