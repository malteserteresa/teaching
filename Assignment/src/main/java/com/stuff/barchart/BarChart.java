package com.stuff.barchart;

import com.stuff.barchart.XAxis;
import com.stuff.barchart.YAxis;

public class BarChart {

	private final YAxis characterAxisAndRelativeFrequencyBars = new YAxis();
	// creates Y Axis object
	private final XAxis relativeFrequencyAxis = new XAxis();
	// creates X Axis object
	
	public void create(String sentence) {
		printMainTitle();
		// prints title 
		characterAxisAndRelativeFrequencyBars.create(sentence);
		// prints out Y Axis
		relativeFrequencyAxis.print();
		// prints out x Axis
	}

	private void printMainTitle() {
		System.out.println("Bar Chart Analysis");
	}
}
