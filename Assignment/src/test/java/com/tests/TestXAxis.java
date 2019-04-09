package com.tests;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.stuff.barchart.XAxis;

public class TestXAxis {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final XAxis xAxis = new XAxis();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testAxis_prints5SpacesFromLeftMargin() {
		xAxis.print();
		
		final String expectedLine    = "   _____________________________________________________________________________________________________";
		final String expectedMarkers = "   '         '         '         '         '         '         '         '         '         '         '";
		final String expectedNumbers = "   0        10        20        30        40        50        60        70        80        90        100";
		final String expectedTitle   = "                                          Relative Frequency (%)";

		assertTrue(outContent.toString().contains(expectedLine));
		assertTrue(outContent.toString().contains(expectedMarkers));
		assertTrue(outContent.toString().contains(expectedNumbers));
		assertTrue(outContent.toString().contains(expectedTitle));
	}
}
