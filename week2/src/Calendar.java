import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numOfDays = 0;
		String NameOfMonth = "Unknown";

		System.out.print("input a month number");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
			NameOfMonth = "January";
			numOfDays = 31;
			break;
		case 2:
			NameOfMonth = "February";
			numOfDays = 29;
			break;
		case 3:
			NameOfMonth = "March";
			numOfDays = 31;
			break;
		case 4:
			NameOfMonth = "April";
			numOfDays = 30;
			break;
		case 5:
			NameOfMonth = "May";
			numOfDays = 31;
			break;
		case 6:
			NameOfMonth = "June";
			numOfDays = 30;
			break;
		case 7:
			NameOfMonth = "July";
			numOfDays = 31;
			break;
		case 8:
			NameOfMonth = "August";
			numOfDays = 31;
			break;
		case 9:
			NameOfMonth = "September";
			numOfDays = 30;
			break;
		case 10:
			NameOfMonth = "October";
			numOfDays = 31;
			break;
		case 11:
			NameOfMonth = "November";
			numOfDays = 30;
			break;
		case 12:
			NameOfMonth = "December";
			numOfDays = 31;

		}
		System.out.print(NameOfMonth + " " + "has" + " " + numOfDays + " " + "days");
		scanner.close();
	}

}
