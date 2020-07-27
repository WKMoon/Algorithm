import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStar = sc.nextInt() * 2 - 1;
        char star = '*';
        char space = ' ';

        for(int i = 1; i <= numStar/2+1; i++){
            for(int k = 0; k < i; k++){
                System.out.print(star);
            }//end for
            for(int j = 1; j <= numStar+1-(i*2); j++){
                System.out.print(space);
            }//end for
            for(int h = 0; h < i; h++){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for

        for(int i = 1; i <= numStar/2; i++){
            for(int k = 0; k < numStar/2 -i+1; k++){
                System.out.print(star);
            }//end for
            for(int j = 0; j < i*2; j++){
                System.out.print(space);
            }//end for
            for(int h = 0; h < numStar/2 -i+1; h++){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for

    }
}
