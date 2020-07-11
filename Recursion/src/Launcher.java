import java.util.Scanner;

//BlackJack
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

		for (int i = 0; i < numArr.length - 2; i++) {// 0,1,2
			for (int j = i + 1; j < numArr.length - 1; j++) {// add integer 1 for avoiding duplication. // 1,2,3 	//1st loop 			//2nd loop 		//3rd loop
				for (int k = j + 1; k < numArr.length; k++) {// add integer 1 for avoiding duplication. // 2,3,4 - 0,1,2 0,1,3 0,1,4 0,2,3 0,2,4 0,3,4 1,2,3 1,3,4 2,3,4 if number of card is 5.
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