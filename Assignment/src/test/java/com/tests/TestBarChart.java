package com.tests;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.stuff.barchart.BarChart;

public class TestBarChart {
	
	private final BarChart barChart = new BarChart();
	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}
	
	// TODO: check if need a @After to reset System setOut
	
	@Test 
	public void testBarChart_containsXAxisTitle() {
		barChart.create("foobar");
		
		final String expectedOutcome = "Relative Frequency (%)";
		assertTrue(outContent.toString().contains(expectedOutcome));
	}
	
	@Test
	public void testBarChart_containsValidData() {
		barChart.create("#I Love Programming");
		
		final String expectedOutcome1 = " # |#####\n";
		final String expectedOutcome2 = " i |##########\n";
		final String expectedOutcome3 = "   |##########\n";
		final String expectedOutcome4 = " l |#####\n";
		final String expectedOutcome5 = " o |##########\n";

		assertTrue(outContent.toString().contains(expectedOutcome1));
		assertTrue(outContent.toString().contains(expectedOutcome2));
		assertTrue(outContent.toString().contains(expectedOutcome3));
		assertTrue(outContent.toString().contains(expectedOutcome4));
		assertTrue(outContent.toString().contains(expectedOutcome5));
	}
	
	@Test
	public void testRun() {
		barChart.create("gvvjvhj");
	}
}
