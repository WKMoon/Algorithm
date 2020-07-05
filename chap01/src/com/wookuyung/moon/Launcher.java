package com.wookuyung.moon;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0;
		int y = 0;

		char[][] board = new char[SIZE][SIZE];

		byte[][] shipBoard = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0 }, { 1, 1, 1, 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };// end byteArr

		for (int i = 1; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char) ('0' + i);
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter point where u want to attack. (00 for exit)");

			String input = sc.nextLine();

			if (input.length() == 2) {
				x = Integer.parseInt(String.valueOf(input.charAt(0)));
				y = Integer.parseInt(String.valueOf(input.charAt(1)));

				if (x == 0 && y == 0) {
					break;
				}
			} // end if

			if (input.length() > 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("Wrong input. Type again");
				continue;
			} // end if

			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

			for (int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);
			}
			System.out.println();
		} // end while

	}

}
