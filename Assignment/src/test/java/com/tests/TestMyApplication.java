package com.tests;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Test;
import com.stuff.MyApplication;

public class TestMyApplication {

	@Test
	public void testIntegration_KeyboardAndTable() throws UnsupportedEncodingException, IOException {

		InputStream originalIn = System.in;
		PrintStream originalOut = System.out;
		
		String input = "Keyboard\nblah\nTable\nExit";
		InputStream userInput = new ByteArrayInputStream(input.getBytes());
		System.setIn(userInput);
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));

		ByteArrayInputStream in = new ByteArrayInputStream("Keyboard".getBytes());
		MyApplication application = new MyApplication(in);
		application.run();

		System.setIn(originalIn);
		System.setOut(originalOut);
		
		System.out.println("Output is here: " + output.toString());
		assertTrue(output.toString().contains("Welcome to my Java Assignment"));
		assertTrue(output.toString().contains("Pick an option\nKeyboard\nDemo\nFile input"));
		assertTrue(output.toString().contains("Enter some text"));
		assertTrue(output.toString().contains("Table Analysis"));
		assertTrue(output.toString().contains("Goodbye"));
	} // retrieved parts from Google (Junit test for System.out.println())

	@Test
	public void testIntegration_KeyboardAndBarchart() throws UnsupportedEncodingException, IOException {

		InputStream originalIn = System.in;
		PrintStream originalOut = System.out;
		
		String input = "Keyboard\nblah\nBar chart\nExit";
		InputStream userInput = new ByteArrayInputStream(input.getBytes());
		System.setIn(userInput);
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));

		ByteArrayInputStream in = new ByteArrayInputStream("Keyboard".getBytes());
		MyApplication application = new MyApplication(in);
		application.run();

		System.setIn(originalIn);
		System.setOut(originalOut);
		
		System.out.println("Output is here: " + output.toString());
		assertTrue(output.toString().contains("Welcome to my Java Assignment"));
		assertTrue(output.toString().contains("Pick an option\nKeyboard\nDemo\nFile input"));
		assertTrue(output.toString().contains("Enter some text"));
		assertTrue(output.toString().contains("Bar Chart Analysis"));
		assertTrue(output.toString().contains("Goodbye"));
	} // retrieved parts from Google (Junit test for System.out.println())
	
@Test
public void testIntegration_KeyboardAndWordCount() {
	InputStream originalIn = System.in;
	PrintStream originalOut = System.out;
	
	String input = "Keyboard\nblah\nWordcount\nExit";
	InputStream userInput = new ByteArrayInputStream(input.getBytes());
	System.setIn(userInput);
	
	ByteArrayOutputStream output = new ByteArrayOutputStream();
	System.setOut(new PrintStream(output));

	ByteArrayInputStream in = new ByteArrayInputStream("Keyboard".getBytes());
	MyApplication application = new MyApplication(in);
	application.run();

	System.setIn(originalIn);
	System.setOut(originalOut);
	
	System.out.println("Output is here: " + output.toString());
	assertTrue(output.toString().contains("Welcome to my Java Assignment"));
	assertTrue(output.toString().contains("Pick an option\nKeyboard\nDemo\nFile input"));
	assertTrue(output.toString().contains("Enter some text"));
	assertTrue(output.toString().contains("Word Count Analysis"));
	assertTrue(output.toString().contains("Goodbye"));
} // retrieved parts from Google (Junit test for System.
}
