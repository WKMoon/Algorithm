
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

//import java.util.Scanner;
//
//public class Launcher {
//
//	public static void main(String[] args) {
//		// Battle ship
//		Scanner in = new Scanner(System.in);
//
//		final int SIZE = 10;
//		int x = 0;
//		int y = 0;
//
//		char[][] board = new char[SIZE][SIZE];
//		byte[][] shipBoard = { { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, { 0, 1, 1, 0, 0, 0, 1, 1, 0 },
//				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 1, 1, 1, 0 },
//				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 1, 0, 0, 0 },
//				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }
//
//		};
//
//		for (int i = 1; i < SIZE; i++) {
//			board[0][i] = board[i][0] = (char) (i + '0');
//		}
//
//		while (true) {
//			System.out.println("Enter point (00 for exit)");
//
//			String input = in.nextLine();
//
//			if (input.length() == 2) {
//				x = input.charAt(0) - '0';
//				y = input.charAt(1) - '0';
//
//				if (x == 0 && y == 0) {
//					System.out.println("Bye Bye");
//					break;
//				} // end if
//			} // end if
//
//			if (input.length() != 2 || x <= 0 || y <= 0 || x >= SIZE || y >= SIZE) {
//				System.out.println("Wrong input");
//				continue;
//			} // end if
//
//			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
//
//			for (int i = 0; i < SIZE; i++) {
//				System.out.println(board[i]);
//			} // end for
//		} // end while
//
//	}// end void
//}// end launcher

// Bingo
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		final int SIZE = 5;
		int x = 0;
		int y = 0;
		int num = 0;

		int[][] bingo = new int[SIZE][SIZE];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			} // end for
		} // end for

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			} // end for
		} // end for

		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				} // end for
				System.out.println();
			} // end for
			System.out.println();
			System.out.printf("Type number between 1 ~ %d. Exit:0", SIZE * SIZE);
			String tmp = in.nextLine();
			num = Integer.parseInt(tmp);

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (num == bingo[i][j]) {
						bingo[i][j] = 0;
						break outer;
					} // end if
				}
			}

		} while (num != 0);
	}// end void
}// end launcher