import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		final String CAMBRIDGE = "CAMBRIDGE";

		System.out.println("Enter word.");
		String word = sc.nextLine();

		StringBuilder wordSB = new StringBuilder(word);
		StringBuilder camSB = new StringBuilder(CAMBRIDGE);

		System.out.println(wordSB.length());
		System.out.println(camSB.length());
		for (int i = 0; i < wordSB.length(); i++) {
			for (int j = 0; j < camSB.length(); j++) {
				if (wordSB.charAt(i) == camSB.charAt(j)) {
					System.out.println(wordSB.charAt(i));
					System.out.println(camSB.charAt(j));
					wordSB.deleteCharAt(i);
				} // end if
			} // end second for
		} // end for

		System.out.println(wordSB.toString());
		sc.close();
	}

}
