package work;

public class Characters {

	public String input;
	// Member variable

	String[] arrayOfLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", "£",
			"$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "[", "}", "]", "~", "#", ":", ";", "@", "'",
			"<", ",", ">", ".", "\\\\", "|", " " };

	public Characters(String sentence) {
		this.input = sentence;
		// 'input' is a member variable which has the value sentence
		// 'this'contains an address to a position in memory where the sentence
		// information is stored
	}

	public String[] splitSentence(String sentence) {
		String[] split = sentence.split("");
		return split;
		// splits sentence into separate characters
	}

	public int compareLetters(String[] split, String letter) {
		int count = 0;
		for (int i = 0; i < split.length; i++) {
			if (lowerCase(split[i]).equals(letter)) {
				count = count + 1;
			}
		}
		return count;
		// For loop ends when i is less than the split sentence length
		// IF the the element of split sentence is equivalent to a letter in the
		// sentence then count will increase if not count will not increase
	}

	private static String lowerCase(String str) {
		str = str.toLowerCase();
		return str;
	}

	public int[] frequenciesOfLetters(String[] split, String[] arrayOfLetters) {
		int[] frequencies = new int[66];
		for (int i = 0; i < 66; i++) {
			int countCharacters = compareLetters(split, arrayOfLetters[i]);
			frequencies[i] = countCharacters;
		}
		return frequencies;
		// initiates the frequency array size of 2
		// for loop to loop through the array
		// countCharacters variable to set the for loop for the arrayOfLetters and to
		// split the sentence into single characters
	}

	// a class is a blueprint used to create objects and contains methods
	// a method is like a set of instructions which tells gives the method signature
	// meaning / something to do
	// Constructor - called when an Object is created, has no return type, not part
	// of a class. To initialise the object of a class
	// a member variable is a variable which is part of a constructor

}
