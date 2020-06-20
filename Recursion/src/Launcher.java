//import java.util.Scanner;
//
//public class Launcher {
//
//	public static void main(String[] args) {
//		// Black Jack
//		Scanner in = new Scanner(System.in);
//
//		int numOfCard = 0;
//		int numberOfLimit = 0;
//
//		numOfCard = in.nextInt();
//		numberOfLimit = in.nextInt();
//		int[] numArr = new int[numOfCard];
//
//		int result = 0;
//
//		System.out.println("Enter " + numOfCard + " digits of numbers");
//
//		for (int i = 0; i < numOfCard; i++) {
//			numArr[i] = in.nextInt();
//		} // end for
//
////for
////inner for
////while
//
//	}// end void
//}// end launcher

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// Battle ship
		Scanner in = new Scanner(System.in);

		final int SIZE = 10;
		int x = 0;
		int y = 0;

		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = { { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, { 0, 1, 1, 0, 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }

		};

		for (int i = 1; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char) (i + '0');
		}

		while (true) {
			System.out.println("Enter point (00 for exit)");

			String input = in.nextLine();

			if (input.length() == 2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0) {
					System.out.println("Cannot use 0,0");
					continue;
				} // end if
			} // end if

			if (input.length() != 2 || x <= 0 || y <= 0 || x >= SIZE || y >= SIZE) {
				System.out.println("Wrong input");
				continue;
			} // end if

			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

			for (int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);
			}
		} // end while

	}// end void
}// end launcher