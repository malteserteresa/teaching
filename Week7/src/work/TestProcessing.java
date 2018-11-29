package work;

public class TestProcessing {

	public static void main(String[] args) {
		String str = "I love Programming";
		char character = 'i';

		System.out.println(character + " occurs " + timesCharOccurs(str, character) + " times ");
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

}
