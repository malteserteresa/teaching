import java.util.Scanner;

public class ListOfLists {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1\t Maths");
		System.out.println("2\t English");
		System.out.println("3\t Science");

		System.out.println("Please enter your choice:");

		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
		case 1:
			System.out.println("Maths, Please chose a sub-heading");
			System.out.println("4\t Shapes");
			System.out.println("5\t add, subtract, divide and multiplication");
			int subheading = scanner.nextInt();
			scanner.nextLine();
			switch (subheading) {
			case 4:
				System.out.println("Welcome to easy learning shapes");
				break;

			case 5:
				System.out.println("Welcome to maths made easier");
				break;
			}
		case 2:
			System.out.println("English, please chose a sub-heading");
			System.out.println("6\t Liturature");
			System.out.println("7\t Language");
			int subheading1 = scanner.nextInt();
			scanner.nextLine();
			switch (subheading1) {
			case 6:
				System.out.println("Welcome to liturature made easier");
				break;
			case 7:
				System.out.println("Welcome to english language made easier");
				break;

			case 3:
				System.out.println("Science, please chose a sub-heading");
				System.out.println("8\t Biology");
				System.out.println("9\t Chemistry");
				System.out.println("10\t Physics");
				int subheading2 = scanner.nextInt();
				scanner.nextLine();
				switch (subheading2) {
				case 8:
					System.out.println("Welcome to Biology made easier");
					break;
				case 9:
					System.out.println("Welcome to Chemistry made easier");
					break;
				case 10:
					System.out.println("Welcome to Physics made easier");

				}
			}
			scanner.close();

		}
	}
}
