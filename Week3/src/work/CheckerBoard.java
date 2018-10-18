package work;

public class CheckerBoard {
	/*
	 * Play time! Change the < to <=, what happens? change j<10 for j<=i
	 * 
	 */

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
				System.out.print("*");
				System.out.print(j);
				System.out.print(" ");
				// System.out.print(" ");
				//

			}
			System.out.println();

		}
	}

}
