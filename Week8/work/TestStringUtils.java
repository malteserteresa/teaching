package work;

public class TestStringUtils {

	public static void main(String[] args) {
		String[] input = { "abc" };
		int expectedOutput = 3;
		int actualOutput = StringArrayUtils.getTotalLength(input);
		boolean testSuccess = actualOutput == expectedOutput;
		if (testSuccess) {
			System.out.println("Test 1 Success");
		} else {
			System.out.println("Test 1 Failed");
			System.out.println("Expected output was: " + expectedOutput);
			System.out.println("Actual output was: " + actualOutput);
		}
	}
}
