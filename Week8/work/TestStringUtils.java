package work;

public class TestStringUtils {

	public static void main(String[] args) {
		String[] stringArray = { "Hi", "my", "name", "is", "Lauren" };
		int expectedOutput = 6;

		if (StringArrayUtils.getMaxLength(stringArray) == expectedOutput) {
			System.out.println("True.");
		} else {
			System.out.println("Flase. True value was " + StringArrayUtils.getMaxLength(stringArray));
		}
	}
}