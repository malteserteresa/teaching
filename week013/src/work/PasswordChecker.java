package work;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		HashMap<String, String> passwordFile = new HashMap<String, String>();
		passwordFile.put("User1", "Password");
		passwordFile.put("User2", "Password2");

		System.out.println("Please enter your user name");
		Scanner sc1 = new Scanner(System.in);
		String yourUserName = sc1.nextLine();

		System.out.println("Please enter your password");
		Scanner sc2 = new Scanner(System.in);
		String yourPassword = sc2.nextLine();

		while (!passwordFile.get(yourUserName).equals(yourPassword)) {
			System.out.println("Password incorrect");
			System.out.println("Enter correct user name");
			Scanner sc3 = new Scanner(System.in);
			yourUserName = sc3.nextLine();

			System.out.println("Please enter correct password");
			Scanner sc4 = new Scanner(System.in);
			yourPassword = sc4.nextLine();
		}
		System.out.println("correct");

	}
}
