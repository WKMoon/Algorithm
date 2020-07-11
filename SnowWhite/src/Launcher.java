import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 numbers");

		int[] num = new int[9];
		int sum = 0;
		int idx1 = 0;
		int idx2 = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		} // end for

		for (int i = 0; i < num.length - 1; i++) {
			idx1 = i;
			sum = 0;
			for (int j = 1; j < num.length; j++) {
				idx2 = j;
				sum = 0;
				for (int k = 0; k < num.length; k++) {
					if (k != idx1 && k != idx2) {
						sum += num[k];
					} // end if
				} // end third for
				if (sum == 100) {
					break;
				} // end if
			} // end second for
			if (sum == 100) {
				break;
			} // end if
		} // end for

		System.out.println(sum);

		for (int i = 0; i < num.length; i++) {
			if (i != idx1 && i != idx2) {
				System.out.println(num[i]);
			} // end if
		} // end for

		sc.close();
	}

}
