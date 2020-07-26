import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStar = sc.nextInt();
        char star = '*';
        String stars = "";

        for(int i = 0; i < numStar; i++){
            for(int k = 0; k <= i; k++){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for
    }
}
