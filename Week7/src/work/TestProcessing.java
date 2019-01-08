package work;

public class TestProcessing {

	public static void main(String[] args) {
		String input = "I love Programming";
		char characterToMatchAgainst = 'i';
		System.out.println(
				characterToMatchAgainst + " occurs " + timesCharOccurs(input, characterToMatchAgainst) + " times ");
		letterFrequencies(input);
	}

	public static int timesCharOccurs(String str, char character) {
		String strLower = lowerCase(str);
		char[] charArray = strLower.toCharArray();
		int numTimes = 0;
		for (int index = 0; index < charArray.length; index++) {
			char i = charArray[index];
			if (i == character) {
				numTimes = numTimes + 1;
			}

		}
		return numTimes;

	}

	private static String lowerCase(String str) {
		str = str.toLowerCase();
		return str;
	}

	public static int[] letterFrequencies(String input) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < 26; i++) {
			int count = timesCharOccurs(input, alphabet[i]);
			System.out.print(count);
		}
		return new int[10];
	}

}
