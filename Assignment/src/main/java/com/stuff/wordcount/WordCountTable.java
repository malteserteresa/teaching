package com.stuff.wordcount;

import java.util.HashMap;
import java.util.Map;

import com.stuff.utilities.Calculator;

public class WordCountTable {
	
	Calculator calculate = new Calculator();
	
	private final Map<String, Integer> table = new HashMap<String, Integer>();

	public void create(String sentence) {
		final int wordCount = calculate.numberOfWords(sentence);
		// calling the method from calculate class to calculate the number of words in sentence 
		table.put("words", wordCount);
		// storing word count in hash map
		final int characterCount = calculate.numberOfCharacters(sentence);
		// calling the method from calculate class to calculate the number of characters in sentence 
		table.put("characters", characterCount);
		// storing the character count in hash map
		final int specialCharactersCount = calculate.numberOfSpecialCharacters(sentence);
		table.put("special characters", specialCharactersCount);
		
		printHeader();
		printBody();
		printFooter();
		// calling in methods to create the table
	}

	private void printBody() {
		System.out.println("|     " + table.get("words") + "      |       " + table.get("characters") + "        |                 " + table.get("special characters") + "                |");
	}

	private void printHeader() {
		System.out.println("Word Count Analysis");
		System.out.println("|------------|-----------------|----------------------------------|");
		System.out.println("| Word Count | Character Count | Non-Alphabetical Character Count |");
		System.out.println("|------------|-----------------|----------------------------------|");
	}
	
	private void printFooter() {
		System.out.println("|------------|-----------------|----------------------------------|");
	}
}
