package work;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCharacters {

	Characters character = new Characters();
	String sentence = "does this work yes or no";

	@Test
	public void testCutString() {
		String[] actualOutcome = sentence.split("");
		String[] expectedOutcome = { "d", "o", "e", "s", "this", "work", "yes", "or", "no" };
		assertTrue(actualOutcome[0].equals(expectedOutcome[0]));
	}

	@Test
	public void testCountFrequency() {
		// break up string
		// count letters
		// numberOfOs = 4
		// assertTrue
		String[] lettersamount = sentence.split("");
		int count = character.countLetters();
		int numberOfO = 4;
		assertTrue(numberOfO == count);
	}
}
