package com.stuff.utilities;

public class Calculator {


    public int frequency(String chosenLetter, String sentence) {

        final String[] splitLetters = splitIntoCharacters(sentence);

        int frequencyCount = 0;
        for (int i = 0; i < splitLetters.length; i++) {
            if (lowerCase(splitLetters[i]).equals(chosenLetter)) {
                frequencyCount++;
            }
        }
        return frequencyCount;
        // For loop ends when i is less than the split sentence length
        // IF the the element of split sentence is equivalent to a letter in the
        // sentence then count will increase if not count will not increase
    }

    public int relativeFrequency(String letter, String sentence) {
        int frequency = frequency(letter, sentence);
        final double frequencyPercentage = ((((double) frequency / sentence.length()) * 100) / 100 ) * 100;

        return (int) frequencyPercentage;
        // easy way to round decimal double to whole number integer
    }

    private String[] splitIntoCharacters(String sentence) {
       final String[] characters = sentence.split("");
        // splitting the string into individual characters
        return characters;
    }

    private String lowerCase(String character) {
    	// convert upper case characters to lower case
        return character.toLowerCase();
    }

	public int numberOfCharacters(String sentence) {
		final int amountOfCharacters = sentence.length();
		// calculates amount of characters in the sentence
		return amountOfCharacters;
	}

	public int numberOfWords(String sentence) {
		final String[] words = sentence.split(" "); 
		// splits string into words 
		final int amountOfWords = words.length;
		// calculates amount of words in the sentence
		return amountOfWords;
	}

	public int numberOfSpecialCharacters(String sentence) {
		final String[] charactersFromSentence = sentence.split("");
		int count = 0;
		for (int i = 0; i < MyCharacters.SPECIAL_CHARACTERS.length; i++) {
			for (int j = 0; j < charactersFromSentence.length; j++) {
				if (MyCharacters.SPECIAL_CHARACTERS[i].equals(charactersFromSentence[j])) {
					count++;
				}
				
			}
		}
		return count;
	}
}
