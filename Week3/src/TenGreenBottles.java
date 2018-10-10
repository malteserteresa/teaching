
public class TenGreenBottles {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i = i - 1) {

			System.out.print(i + " green bottles hanging on the wall " + i
					+ " green bottles hanging on the wall and if one green bottle should accidentally fall, there'll be "
					+ (i - 1) + " hanging on the wall");
		}
	}
}
