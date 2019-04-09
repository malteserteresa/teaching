package com.stuff.table;

import com.stuff.utilities.Calculator;
import com.stuff.utilities.MyCharacters;

public class Body {

    private final Calculator calculate = new Calculator();
    // new calculate object

    public void printRows(String inputtedSentence) {
        String[] charactersArray = MyCharacters.ALL;
        // calls in my characters array from my characters class
        for (int i = 0; i < charactersArray.length; i++) {
        	// loops through all characters in the array and prints row
            int frequency = calculate.frequency(charactersArray[i], inputtedSentence);
            int relativeFrequency = calculate.relativeFrequency(charactersArray[i], inputtedSentence);
            
            printCharactersColumn(charactersArray[i]);
            printFrequencyColumn(frequency);
            printRelativeFrequencyColumn(relativeFrequency);
        } // print each column with data needed
        printTableFooter();
    }

    private void printCharactersColumn(String character) {
        System.out.print("|     " + character + "      ");
    }

    private void printFrequencyColumn(int number) {
        int numberPlaceHolderLength = 6;
        // gap between the frequency number and the end of the column
        int numberOfDigits = Integer.toString(number).length();
        // changes int number to string to get the length
        int whiteSpacesRequired = numberPlaceHolderLength - numberOfDigits;
        String whiteSpaces = "";

        for (int i = 0; i < whiteSpacesRequired; i++) {
            whiteSpaces = whiteSpaces + " ";
        } // adds number of white spaces need until end of column

        System.out.print("|     " + number + whiteSpaces);
    }

    private void printRelativeFrequencyColumn(int number) {
        int numberPlaceHolderLength = 9;
        int numberLength = String.valueOf(number).length();
        int whiteSpacesRequired = numberPlaceHolderLength - numberLength;
        String whiteSpaces = "";

        for (int i = 0; i < whiteSpacesRequired; i++) {
            whiteSpaces = whiteSpaces + " ";
        }

        System.out.println("|          " + number + "%" + whiteSpaces + "|");
    }
    
    private void printTableFooter() {
    	System.out.println("|------------|-----------|--------------------|");
    }
}
