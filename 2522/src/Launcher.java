import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStar = sc.nextInt();
        char star = '*';
        char space = ' ';


        for(int i = 0; i < (numStar *2-1)/2+1; i++){
            for(int k = 0; k < numStar/2 -i+1; k++){
                System.out.print(space);
            }//end for
            for(int j = 0; j <= i; j++){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for

        for(int i = 0; i < (numStar *2-1)/2; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(space);
            }//end for
            for(int k = i; k < numStar-1; k++){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for
    }
}
