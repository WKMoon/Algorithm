import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 words for cross word");

		String a = sc.nextLine().toUpperCase();
		String b = sc.nextLine().toUpperCase();

		int aIdx = 0;
		int bIdx = 0;

		int aIdx2 = 0;
		int bIdx2 = 0;

		boolean bool = true;
		char[][] cArr = new char[b.length()][a.length()];

		for (int i = 0; i < a.length(); i++) {
			for (int k = 0; k < b.length(); k++) {
				if (a.charAt(i) == b.charAt(k)) {
					aIdx = k;
					bIdx = i;
					bool = false;
					break;
				} // end if
			} // end second for
			if (!bool) {
				break;
			} // end if

		} // end for

		for (int i = 0; i < cArr.length; i++) {
			for (int k = 0; k < cArr[i].length; k++) {
				if (i == aIdx && k == bIdx) {
					cArr[i][k] = a.charAt(aIdx2++);
					bIdx2++;
					continue;
				} // end if

				if (i == aIdx)
					cArr[i][k] = a.charAt(aIdx2++);// it's would be 0 at first,but it's incremented after evaluating.
				else if (k == bIdx)
					cArr[i][k] = b.charAt(bIdx2++);
				else
					cArr[i][k] = '.';
			} // end second for
		} // end for

		for (int i = 0; i < cArr.length; i++) {
			for (int k = 0; k < cArr[i].length; k++) {
				System.out.print(cArr[i][k]);
			} // end second for
			System.out.println();
		} // end for

		sc.close();
	}

}
