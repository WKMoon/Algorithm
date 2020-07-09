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

		System.out.println("Enter " + numOfCard + " digits of numbers");

		for (int i = 0; i < numOfCard; i++) {
			numArr[i] = in.nextInt();
		} // end for

		int sum = 0;
		int result = 0;

		for (int i = 0; i < numArr.length - 2; i++) {
			for (int j = i + 1; j < numArr.length - 1; j++) {
				for (int k = j + 1; k < numArr.length; k++) {
					sum = numArr[i] + numArr[j] + numArr[k];
					if (sum <= numberOfLimit && sum > result) {
						result = sum;
					} // end if
				} // end third for
			} // end second for
		} // end for

		System.out.println(result);
	}// end void
}// end launcher