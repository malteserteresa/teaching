package com.tests;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.stuff.wordcount.WordCountTable;

public class TestWordCount {

	final WordCountTable wordCount = new WordCountTable();
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testPrintOutHeader() {
		wordCount.create("A cat sat on a mat");
		
		final String expectedOutcome = "| Word Count | Character Count |";
		assertTrue(outContent.toString().contains(expectedOutcome));
	}
	
	@Test 
	public void testPrintOutBody() {
		wordCount.create("A cat sat on a mat");

		final String expectedOutcome = "|     6      |       18        |";
		assertTrue(outContent.toString().contains(expectedOutcome));
	}
	
	@Test
	public void testTwo() {
		wordCount.create("Hi I Am Lauren");

		final String expectedOutcome = "|     4      |       14        |";
		assertTrue(outContent.toString().contains(expectedOutcome));
	}
	
	
}
