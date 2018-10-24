package work;

public class PrintTable {

	public static void main(String[] args) {
		printPattern();
	}

	static void printPattern() {
		printsDashes();
		printsPipes();
		System.out.println("| a | b | c | d | e |");
		printsPipes();
		printsDashes();
	}

	static void printsDashes() {
		System.out.println("---------------------");
	}

	static void printsPipes() {
		System.out.println("|   |   |   |   |   |");
	}

}
