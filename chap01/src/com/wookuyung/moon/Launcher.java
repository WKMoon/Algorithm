package com.wookuyung.moon;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		final int SIZE = 5;
		int num = 0;
		int[][] bingo = new int[SIZE][SIZE];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			} // end for
		} // end for

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				int x = (int) (Math.random() * SIZE);
				int y = (int) (Math.random() * SIZE);

				int tmp = bingo[x][y];
				bingo[x][y] = bingo[i][j];
				bingo[i][j] = tmp;
			}
		}

		do {

			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			} // end for
			System.out.println();

			System.out.println("Enter number between 1 to 25. 0 for Exit");

			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}

		} while (num != 0);

		sc.close();

	}

}
