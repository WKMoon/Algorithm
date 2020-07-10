import java.util.Arrays;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int NUM = 8;
		int[] scoreArr = new int[NUM];

		System.out.println("Type scores of 8 questions.");

		//// Input Validation
		for (int i = 0; i < NUM; i++) {
			scoreArr[i] = sc.nextInt();
			while (scoreArr[i] > 150 || scoreArr[i] < 0) {
				System.out.println("Should be less or equal to 150. Enter again");
				scoreArr[i] = sc.nextInt();

			} // end while
		} // end for

		int sum = 0;
		int[] idxStorage = new int[3];
		int[] printIdxArr = new int[5];

		int[] scoreArrClone = Arrays.copyOf(scoreArr, NUM);
		Arrays.sort(scoreArrClone);

		for (int i = 0; i < idxStorage.length; i++) {
			for (int j = 0; j < scoreArr.length; j++) {
				if (scoreArrClone[i] == scoreArr[j]) {
					idxStorage[i] = j;
				} // end if
			} // end second for
		} // end for

		for (int i = 0; i < scoreArr.length; i++) {
			if (i == idxStorage[0] || i == idxStorage[1] || i == idxStorage[2]) {
				continue;
			} else {
				sum += scoreArr[i];
			} // end else
		} // end for

		System.out.println(sum);

		for (int i = 0; i < scoreArr.length; i++) {
			if (i == idxStorage[0] || i == idxStorage[1] || i == idxStorage[2]) {
				continue;
			} else {
				System.out.print((i + 1) + " ");
			} // end else

		} // end for

	}// end main

}// end class
