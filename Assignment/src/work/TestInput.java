package work;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;

import org.junit.Test;

public class TestInput {

	String file = "UserInput.txt";
	FileInput input = new FileInput();

	String firstLine = "Hello";

	@Test
	public void testGetFileName() {
		String usersInputString = input.getFileName();
		assertTrue(usersInputString.equals(file));
	}

	@Test
	public void testCreateReader() throws Exception {
		BufferedReader reader = input.createReader(file);
		assertNotNull(reader);
	}

	@Test
	public void testFileReads() throws Exception {
		BufferedReader reader = input.createReader(file);
		String line = reader.readLine();
		assertTrue(firstLine.equals(line));
	}

	@Test
	public void testDoesCatchWork() {

	}

}
