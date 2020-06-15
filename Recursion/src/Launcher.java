import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// Black Jack
		Scanner in = new Scanner(System.in);

		int numOfCard = 0;
		int numberOfLimit = 0;

		numOfCard = in.nextInt();
		numberOfLimit = in.nextInt();
		int[] numArr = new int[numOfCard];

		int result = 0;

		System.out.println("Enter " + numOfCard + " digits of numbers");

		for (int i = 0; i < numOfCard; i++) {
			numArr[i] = in.nextInt();
		} // end for

		while (result < numberOfLimit) {
			if (result < numberOfLimit) {
				for (int x = 0; x < numArr.length; x++) {

				} // end for
			} // end if
			else if (result == numberOfLimit) {
				break;
			} // end elif
		} // end while

	}// end void
}// end launcher
