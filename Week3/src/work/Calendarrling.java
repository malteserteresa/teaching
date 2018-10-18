package work;

import java.util.Scanner;

public class Calendarrling {
	/*
	 * I'm to pooooosh darling to think for myself. So I when I tell you a month, I
	 * want you to tell me how many days are in it. That ok sweety?
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a month number");

		int monthdays = scanner.nextInt();

		int days = 0;
		String month = "unknown";

		switch (monthdays) {
		case 1:
			month = "January";
			days = 31;
			break;
		case 2:
			month = "February";
			days = 28;
			break;
		case 3:
			month = "March";
			days = 31;
			break;
		case 4:
			month = "April";
			days = 30;
			break;
		case 5:
			month = "May";
			days = 31;
			break;
		case 6:
			month = "June";
			days = 30;
			break;
		case 7:
			month = "July";
			days = 31;
			break;
		case 8:
			month = "August";
			days = 31;
			break;
		case 9:
			month = "September";
			days = 30;
			break;
		case 10:
			month = "October";
			days = 31;
			break;
		case 11:
			month = "November";
			days = 30;
			break;
		case 12:
			month = "December";
			days = 31;
			break;
		}

		System.out.println(month + " has " + days + " days in it ");
		scanner.close();
	}
}