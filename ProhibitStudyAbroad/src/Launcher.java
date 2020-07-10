import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		final String CAMBRIDGE = "CAMBRIDGE";

		System.out.println("Enter word.");
		String word = sc.nextLine().toUpperCase();

		StringBuilder wordSB = new StringBuilder(word);
		StringBuilder camSB = new StringBuilder(CAMBRIDGE);

		for (int i = 0; i < wordSB.length(); i++) {
			for (int j = 0; j < camSB.length(); j++) {
				if (wordSB.charAt(i) == camSB.charAt(j)) {
					wordSB.deleteCharAt(i);
					--i;// reduce 1 length after deleting a duplicated letter
				} // end if
			} // end second for
		} // end for

		System.out.println(wordSB.toString());
		sc.close();
	}

}
