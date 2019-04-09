package com.stuff.utilities;

// to read in a file, to speak to the characters class, which will then count each character in the file.  

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public String reader(final String fileName) throws IOException {
		final BufferedReader reader = new BufferedReader(new FileReader(fileName));
		return readAllLines(reader);
		// reads the text from character input stream (text file)
	}

	private String readAllLines(final BufferedReader reader) throws IOException {
		StringBuilder allLines = new StringBuilder();
		// creates a new object 
		String line;
		while ((line = reader.readLine()) != null) {
			allLines.append(line);
		} // read the file 
		return allLines.toString();
	}

}