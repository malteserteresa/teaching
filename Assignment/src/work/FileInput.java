package work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileInput {

	public String getFileName() {
		Scanner userPicksFile = new Scanner(System.in);

		System.out.println("Enter a filename to read from");
		String name = userPicksFile.nextLine();

		userPicksFile.close();
		return name;
	}

	public BufferedReader createReader(String fileName) throws FileNotFoundException {
		BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
		return fileReader;

	}

}