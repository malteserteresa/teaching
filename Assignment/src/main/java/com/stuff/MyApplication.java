package com.stuff;

import com.stuff.barchart.BarChart;
import com.stuff.table.Table;
import com.stuff.utilities.MyFileReader;
import com.stuff.utilities.MyDemo;
import com.stuff.wordcount.WordCountTable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MyApplication {

    private final Scanner input;
    private final Table table = new Table();
    private final BarChart barChart = new BarChart();
    private final WordCountTable wordCount = new WordCountTable();
    private final MyFileReader readFile = new MyFileReader();
    private boolean stopApp = false;
    
    public MyApplication(InputStream inputStream) {
        this.input = new Scanner(System.in);
    } // Constructor, takes in Input Stream to help me test and simulate an input

    public void run() {
    	while (!stopApp) {
    		displayWelcomeMessageAndInputOptions();
    		chooseADataInputOption();
    	}
    } // runs the start of my application

    private void chooseADataInputOption() {
        boolean chosenSuccessfully = false;
    	while (!chosenSuccessfully) {
    		final String userInput = input.nextLine();
    	
	    	if ("Keyboard".equals(userInput)) {
	            runKeyboardOption();
	            chosenSuccessfully = true;
	            
	        } else if ("Demo".equals(userInput)) {
	            runDemoOption();
	            chosenSuccessfully = true;
	            
	        } else if ("File input".equals(userInput)) {
	            runFileInputOption();
	            chosenSuccessfully = true;
	            
	        } else {
	        	askToReEnterDataInputOption();
	        } 
    	}
    } // tells the program which option to run, by calling the suitable method


	private void runDemoOption() {
        displayHardcodedSentenceForDemo();
        displayAnalysis(MyDemo.SENTENCE);
        // takes in the hard coded sentence
    }

	private void runFileInputOption() {
		askToInputFileName();
        // asking the user to enter a file name 
		boolean fileNameFound = false;
		while (!fileNameFound) {
        final String inputedFileName = input.nextLine();
        String fileText = "";
		try {
			fileText = readFile.reader(inputedFileName);
			fileNameFound = true;
			displayAnalysis(fileText);
		} catch (FileNotFoundException fnfe) {
			System.out.println("The File could not be found\nRe Enter a Valid File Name");

		} catch (IOException ioe) {
			System.out.println("Input issue\nRe Enter a Valid File Name");
		}
		}
        // asks user to pick table or bar chart option
    } // pass through the text from a file and creates a table or bar chart 


    private void runKeyboardOption() {
        askToInputAnyText();
        // asks user to input random text
        final String inputtedText = input.nextLine();

        displayAnalysis(inputtedText);
    } // get users inputed text and create table or bar chart depending on there chosen option

	private void displayAnalysis(final String sentence) {
        askToChooseTableOrBarchartOrWordcountDisplay();
        boolean chosenSuccessfully = false;
    	while (!chosenSuccessfully) {
    		final String chosenDisplay = input.nextLine();
			if ("Table".equals(chosenDisplay)) {
	            table.create(sentence);
	            askToChooseTableOrBarchartOrWordcountDisplay();
	        } else if ("Bar chart".equals(chosenDisplay)) {
	            barChart.create(sentence);
	            askToChooseTableOrBarchartOrWordcountDisplay();
	        } else if ("Wordcount".equals(chosenDisplay)) {
	        	wordCount.create(sentence);
	            askToChooseTableOrBarchartOrWordcountDisplay();
	        } else if ("Main Menu".equals(chosenDisplay)) {
	        	break;
	        } else if ("Exit".equals(chosenDisplay)) {
	        	displayExit();
	        	stopApp = true;
	        	break;
	        } else {
	        	askToReEnterDataInputOption();
	        }
    	}
	}
	
	private void displayHardcodedSentenceForDemo() {
		System.out.println("Demo sentence: " + MyDemo.SENTENCE);
	}

	private void askToInputFileName() {
        System.out.println("Enter file name");
    }

    private void askToInputAnyText() {
        System.out.println("Enter some text");
    }

    private void displayWelcomeMessageAndInputOptions() {
		System.out.println("Welcome to my Java Assignment\nPick an option\nKeyboard\nDemo\nFile input");
	}
	
	private void askToChooseTableOrBarchartOrWordcountDisplay() {
		System.out.println("How would you like it to be displayed?\nTable\nBar chart\nWordcount\nOr Main Menu\nOr Exit");
	}
	
	private void askToReEnterDataInputOption() {
		System.out.println("Please re enter a valid option");
	}
	
	private void displayExit() {
		System.out.println("Goodbye");
	}
}
