
/* write a java program to print 'Hello' on screen and then
 * print your name on a separate line*/

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your first name?");
		String fname = scanner.next();
		System.out.println("what is your last name?");
		String lname = scanner.next();
		System.out.println();
		System.out.println("hello \n" + fname + " " + lname);
		scanner.close();
	}
}
