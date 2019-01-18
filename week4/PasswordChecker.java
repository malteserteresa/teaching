import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userInput = "";

		String password = "Mmudts";

		do 
		{
			System.out.println("Enter password");
			userInput = scanner.nextLine();
		} while (!password.equals(userInput));
		
		System.out.println("success");
	
		scanner.close();
	}

}
