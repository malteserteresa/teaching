package work;

public class NestedForLoop2 {

	public static void main(String[] args) {
		for (int i = 5; i > 0; i = i - 1) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
