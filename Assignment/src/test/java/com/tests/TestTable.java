package com.tests;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.stuff.table.Table;


public class TestTable {

//	private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final Table table = new Table();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testAllHeadingsPrintOut() {
		String sentence = "The cat sat on the mat";
		table.create(sentence);

		final String actualOutput = outContent.toString().trim();
		assertTrue(actualOutput.contains("|------------|-----------|--------------------|"));
		assertTrue(actualOutput.contains("| Calculator | Frequency | Relative Frequency |"));
	}

	@Test
	public void testCharactersColumnFormat_IsCentralised() {
		String sentence = "The cat sat on the mat";
		table.create(sentence);

		final String actualOutput = outContent.toString().trim();
		assertTrue(actualOutput.contains("|     a      |"));
		// get the content that is being printed, put it into a string and clean
		// it(trim), checks that | a | is there
	}

	@Test
	public void testFrequenciesPrintOut_IsCorrect_AndCentralised() {
		String sentence = "The cat sat on the mat";
		table.create(sentence);

		final String actualOutput = outContent.toString().trim();
		assertTrue(actualOutput.contains("|     a      |     3     |"));
	}

	@Test
	public void testRelativeFrequencyPrintsOut_UnderRelativeFrequencyHeading() {
		String sentence = "The cat sat on the mat";
		table.create(sentence);

		final String actualOutput = outContent.toString().trim();
		assertTrue(actualOutput.contains("| Calculator | Frequency | Relative Frequency |"));
		assertTrue(actualOutput.contains("|------------|-----------|--------------------|"));
		assertTrue(actualOutput.contains("|     a      |     3     |          13%       |"));
		assertTrue(actualOutput.contains("|     b      |     0     |          0%        |"));
	}

	@Test
	public void testColumnResizeFrequencyColumn() {
		String sentence = "aaaaaaaaaaaa";
		table.create(sentence);

		final String actualOutput = outContent.toString().trim();
		assertTrue(actualOutput.contains("| Calculator | Frequency |"));
		assertTrue(actualOutput.contains("|     a      |     12    |"));
	}
}
