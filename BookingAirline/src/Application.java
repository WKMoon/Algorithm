import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {

	boolean[][] seats = new boolean[4][4];
	ArrayList<String> passengers = new ArrayList<String>();
	boolean loop = false;
	int exit = 0;
	String answer = "";

	private int seatClass;
	private String passengerName;
	Scanner input = new Scanner(System.in);

	protected int getSeatClass() {
		return seatClass;
	}

	protected void setSeatClass(int seatClass) {
		this.seatClass = seatClass;
	}

	protected String getPassengerName() {
		return passengerName;
	}

	protected void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void start() {

		String name = "";
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < seats.length; i++) {
			for (int k = 0; k < seats[i].length; k++) {
				seats[i][k] = false;
			} // end second for
		} // end seats for

		do {
			loop = false;
			String firstName = askFname();
			String lastName = askLname();
			name = firstName + " " + lastName;
			setPassengerName(name);
			pickClass();
			printSeat(seats);
			exit = numberVal("If you want to quit this Program. Press 1 or 2 for keep doing it");
			if (exit == 1) {
				System.out.println("Bye Bye");
				System.out.println();
				System.out.println("\t==================\t");
				System.out.println("\tCustomer List\t");
				passengerList();
				System.out.println("\t==================\t");
				input.close();
				System.exit(0);
			} // end if
			else if (exit == 2) {
				loop = false;
			}
		} while (!loop);

	}// end start

	private String askFname() {
		String fName = "";
		do {
			System.out.println("Enter first name");
			fName = input.nextLine().toLowerCase();
			if (nameVal(fName)) {
				loop = true;
				return fName;
			} // end if
			else {
				System.out.println("Invalid Enter, Try Again");
				loop = false;
			} // end else
		} while (!loop);
		loop = false;
		return fName;
	}// end askFname

	private String askLname() {
		String lName = "";

		do {
			System.out.println("Enter last name");
			lName = input.nextLine().toLowerCase();
			if (nameVal(lName)) {
				loop = true;
				return lName;
			} // end if
			else {
				System.out.println("Invalid Enter, Try Again");
				loop = false;
			} // end else
		} while (!loop);
		loop = false;
		return lName;
	}// end aksLname

	private int pickClass() {
		System.out.println("Which class would you like to get?");
		int level = numberVal("Please type 1 for First Class or 2 for Economy: ");

		if (level == 1) {

			if (seats[1][2] && seats[1][3]) {
				System.out.println("First Class is full. Do you want to get Economy Class? (y/n)");
				answer = input.nextLine().toLowerCase();
				if (answer.equals("y")) {
					economyClass();
				} // end second if
				else {
					System.out.println("Next flight leaves in 3 hours");
				} // end else
			} // end if
			else {
				firstClass();
			} // end else
		} // end if

		else if (seats[1][2] && seats[1][2] && seats[3][2] && seats[3][3]) {
			System.out.println("All seats are unavailable. Next flight leaves in 3 hours. Bye Bye.");
			System.out.println();
			System.out.println("\t==================\t");
			System.out.println("\tCustomer List\t");
			passengerList();
			System.out.println("\t==================\t");
			System.exit(0);
		} // end else if

		else {

			if (seats[3][2] && seats[3][3]) {
				System.out.println("Economy Class is full. Do you want to get First Class? (y/n)");
				answer = input.nextLine().toLowerCase();
				if (answer.equals("y")) {
					firstClass();
				} // end second if
				else {
					System.out.println("Next flight leaves in 3 hours");

				} // end else
			} // end if
			else {
				economyClass();
			} // end else
		} // end else

		return level;

	}// end pickClass

	private String firstClass() {
		System.out.println("Which side of seat would you like to get?");
		int side = numberVal("Please type 1 for window and 2 for asile");
		String answer = "";
		int row = 0, col = 0;
		boolean booked = false;
		String letter = "";
		String seatNum = "";

		if (side == 1 && seats[1][3]) {
			System.out.println("Window seats are fully booked. If you want an Asile seat, please enter 'y' or 'n'");
			answer = input.nextLine().toLowerCase();
			if (answer.equals("y")) {
				side = 2;
			} // end second if
			else {
				System.out.println("Next flight leaves in 3 hours");
			} // end else
		} // end if

		else if (side == 2 && seats[1][2]) {
			System.out.println("Asile seats are fully booked. If you want an Window seat, please enter 'y' or 'n'");
			answer = input.nextLine().toLowerCase();
			if (answer.equals("y")) {
				side = 1;
			} // end second if
			else {
				System.out.println("Next flight leaves in 3 hours");
			} // end else
		} // end else if

		for (row = 0; row < 2; row++) {
			for (col = 0; col < 4; col++) {
				if (seats[row][col] == false) {
					if (side == 1 && (col == 0 || col == 3)) {
						booked = true;
						break;
					} // end second if
					else if (side == 2 && (col == 1 || col == 2)) {
						booked = true;
						break;
					} // end else if
				} // end if
			} // end second for
			if (booked) {
				seats[row][col] = true;
				break;
			} // end if
		} // end for

		if (booked) {
			switch (col) {
			case 0:
				letter = "A";
				break;
			case 1:
				letter = "B";
				break;
			case 2:
				letter = "C";
				break;
			case 3:
				letter = "D";
				break;
			}// end switch

			setSeatClass(1);
			seatNum = 1 + "" + letter;
			boardingPass(seatNum);

		} // end if

		return seatNum;
	}// end firstClass

	private String economyClass() {
		System.out.println("Which side of seat would you like to get?");
		int side = numberVal("Please type 1 for window and 2 for asile");
		String answer = "";
		int row = 0, col = 0;
		boolean booked = false;
		String letter = "";
		String seatNum = "";

		if (side == 1 && seats[3][3]) {
			System.out.println("Window seats are fully booked. If you want an Asile seat, please enter 'y' or 'n'");
			answer = input.nextLine().toLowerCase();
			if (answer.equals("y")) {
				side = 2;
			} // end second if
			else {
				System.out.println("Next flight leaves in 3 hours");
			} // end else
		} // end if

		else if (side == 2 && seats[3][2]) {
			System.out.println("Asile seats are fully booked. If you want an Window seat, please enter 'y' or 'n'");
			answer = input.nextLine().toLowerCase();
			if (answer.equals("y")) {
				side = 1;
			} // end second if
			else {
				System.out.println("Next flight leaves in 3 hours");
			} // end else
		} // end else if

		for (row = 2; row < 4; row++) {
			for (col = 0; col < 4; col++) {
				if (seats[row][col] == false) {
					if (side == 1 && (col == 0 || col == 3)) {
						booked = true;
						break;
					} // end second if
					else if (side == 2 && (col == 1 || col == 2)) {
						booked = true;
						break;
					} // end else if
				} // end if
			} // end second for
			if (booked) {
				seats[row][col] = true;
				break;
			} // end if
		} // end for

		if (booked) {
			switch (col) {
			case 0:
				letter = "A";
				break;
			case 1:
				letter = "B";
				break;
			case 2:
				letter = "C";
				break;
			case 3:
				letter = "D";
				break;
			}// end switch

			setSeatClass(2);
			seatNum = 2 + "" + letter;
			boardingPass(seatNum);

		} // end if

		return seatNum;
	}// end economyClass

	private String boardingPass(String seatNum) {
		String passenger = "";
		String ticket = "";
		ticket += "\tBoarding Pass\n";
		ticket += "------------------------------\n";
		ticket += "\tname: " + getPassengerName() + "\n";
		ticket += "\tSeat Class: " + getSeatClass() + "\n";
		ticket += "\tSeat Number: " + seatNum + "\n";
		ticket += "------------------------------";

		passenger = "\t" + getPassengerName() + " " + seatNum + "\t";
		passengers.add(passenger);

		System.out.println(ticket);
		return ticket;
	}// end boarding

	private void printSeat(boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				if (!arr[i][k]) {
					System.out.print("O\t");
				} else {
					System.out.print("X\t");
				} // end else
			} // end second for
			System.out.println();
		} // end for
	}// end printSeat

	////////////// VALIDATION //////////////
	private boolean nameVal(String name) {
		char testChar;
		String validChars = "abcdefghijklmnopqrstuvwxyz-'  ";
		if (name.length() == 0 || name.equals(" ")) {
			return false;
		} // end if
		for (int i = 0; i < name.length(); i++) {
			testChar = name.charAt(i);
			if (validChars.indexOf(testChar) < 0) {
				return false;
			} // end if
		} // end for
		return true;
	}// end naveVal

	private int numberVal(String n) {
		String numby;
		int num = 0;
		boolean loop;
		String abc = "\\d+";
		do {
			System.out.println(n);
			numby = input.nextLine();
			if (numby.matches(abc)) {
				num = Integer.parseInt(numby);
				if (num == 1 || num == 2)
					loop = false;
				else {
					System.out.println("Invalid Input. Choose 1 or 2");
					loop = true;
				} // end else
			} else {
				System.out.println("Invalid Input. Input must be number 1 or 2");
				loop = true;
			} // end else
		} while (loop);
		return num;
	}// end numberVal

	private void passengerList() {
		Collections.sort(passengers);

		for (int i = 0; i < passengers.size(); i++) {
			System.out.println(passengers.get(i));
		} // end for
	}// end passengerList

}// end class
