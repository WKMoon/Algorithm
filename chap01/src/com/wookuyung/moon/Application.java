package com.wookuyung.moon;

import java.util.Scanner;

public class Application {

	public void start() {
		Scanner in = new Scanner(System.in);
		String question = "y";
		String askingName = "";
		boolean loop = false;

		while (question.equals("y")) {
			do {
				System.out.println("Type Name of Salesperson");
				askingName = in.nextLine();
				System.out.println("Name: " + askingName);
			} while (loop);
		} // end while

	}// end start

}
