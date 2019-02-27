package work;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCharacters {

	String sentence = "does this work yes or no";

	Characters character = new Characters(sentence);

	@Test
	public void testCanSetInputToGivenSentence() {
		String charactersInput = character.input;
		// 'String charactersInput' is the variable
		// 'character' is the object we established
		// 'input' is calling the member variable from the characters constructor which
		// has the value sentence
		assertTrue(charactersInput == "does this work yes or no");

	}

	@Test
	public void testSplitsSentenceIntoCharacters() {
		String[] splitOutcome = character.splitSentence(sentence);
		String[] splitExpectedOutcome = { "d", "o", "e", "s", "this", "work", "yes", "or", "no" };
		assertTrue(splitOutcome[0].equals(splitExpectedOutcome[0]));
		// String[] splitOutcome calls in splitSentence method and has the sentence
		// initialised
		// String[] splitExpectedOutcome is what we expect to happen

	}

	@Test
	public void testCanLoopThroughSentence_returnsCount() {
		String newSentence = "a";
		String[] split = character.splitSentence(newSentence);
		int afterCount = character.compareLetters(split, newSentence);
		assertTrue(afterCount == 1);
		// String[] split calls in the split sentence method to split the new sentence
		// up
		// afterCount calls in the compareLetters method and has the result of split and
		// the new sentence
		// afterCount equals 1 as there is only one a

	}

	@Test
	public void testCanCountSecondLetter() {
		String[] split = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "£", "$",
				"%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "[", "}", "]", "~", "#", ":", ";", "@", "'", "<",
				",", ">", ".", "\\\\", "|", " " };
		String[] arrayOfLetters = character.arrayOfLetters;
		int[] result = character.frequenciesOfLetters(split, arrayOfLetters);
		assertTrue(result[0] == 1);
		assertTrue(result[5] == 1);
		// String[] arrayOfLetters is the letters we want to test to look for
		// the first assertTrue checks that the array place 0 equals 1 as there is only

	}

	@Test
	public void testCanCountSingleCharacter() {
		String[] split = { "a" };
		int[] result = character.frequenciesOfLetters(split, character.arrayOfLetters);
		assertTrue(result[0] == 1);

	}

	@Test
	public void testCanHandleCases() {
		String[] splitCapital = { "A" };
		int[] result = character.frequenciesOfLetters(splitCapital, character.arrayOfLetters);
		assertTrue(result[0] == 1);
	}

}
