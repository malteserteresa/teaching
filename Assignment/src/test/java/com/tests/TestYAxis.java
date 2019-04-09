package com.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.Before;
import org.junit.Test;

import com.stuff.barchart.YAxis;

import static org.junit.Assert.assertTrue;

public class TestYAxis {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final YAxis yAxis = new YAxis();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	public void testYAxisTitlePrints() {
		yAxis.create("aaabb");

		final String expectedA = " a |############################################################\n";
		final String expectedB = " b |########################################\n";

		assertTrue(outContent.toString().contains(expectedA));
		assertTrue(outContent.toString().contains(expectedB));
	}
	
}
