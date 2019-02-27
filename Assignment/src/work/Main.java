package work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		String fileInput = fileInputHandler();
		int[] characterCount = characterCountHandler(fileInput);
		System.out.println(Arrays.toString(characterCount));

	}

	public static String fileInputHandler() {
		FileInput fileInput = new FileInput();
		String name = fileInput.getFileName();
		BufferedReader reader;
		String line = "";
		try {
			reader = fileInput.createReader(name);
			line = reader.readLine();

		} catch (FileNotFoundException fnfe) {
			System.out.println("The File could not be found");

		} catch (IOException ioe) {
			System.out.println("Input issue");
		}
		return line;
	}

	public static int[] characterCountHandler(String line) {
		Characters character = new Characters(line);
		String[] splitSentence = character.splitSentence(line);
		int[] frequenciesOfLetters = character.frequenciesOfLetters(splitSentence, character.arrayOfLetters);
		return frequenciesOfLetters;
	}

	public void barChartHandler(int[] characterCounts) {

	}

}
