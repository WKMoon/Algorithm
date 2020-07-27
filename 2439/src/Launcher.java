import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStar = sc.nextInt();
        char star = '*';
        String space = " ";

        for(int i = 1; i <= numStar; i++){
            for(int k = 1; k <= numStar-i; k++){
                System.out.print(space);
            }//end for
            for(int j = 1; j <= i; j++ ){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for

    }
}
