package chap01;

public class Hello {

	public static void main(String[] args) {
		printScore(100);

		printScore(120);
	}

	public static void printScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println("it's wrong " + score);
		} else
			System.out.println("score " + score);
		return;
	}

}
