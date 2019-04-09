package com.stuff.barchart;

import com.stuff.utilities.Calculator;
import com.stuff.utilities.MyCharacters;

public class YAxis {

    private Calculator calculate = new Calculator();
    private static char BAR_STYLE = '#';

	public void create(String sentence) {

	    final String[] charactersToCompare = MyCharacters.ALL;
	    // calls in my characters array
	    for (int i = 0; i < charactersToCompare.length; i++) {
	    	// loops through as many times as the length of my characters
            printLetterAndAxisOnNewLine(charactersToCompare[i]);
            
            double relativeFrequency = calculate.relativeFrequency(charactersToCompare[i], sentence);
            // calculates relative frequency
            printBar(relativeFrequency);
	    }
    }

    private void printBar(double relativeFrequency) {
        for (int i = 0; i < relativeFrequency; i++) {
        	// loops through the amount times of the relative frequency and print outs one hash tag each time
            System.out.print(BAR_STYLE);
        }
    }

    private void printLetterAndAxisOnNewLine(String letter) {
        System.out.print("\n " + letter + " |");
    }
}
