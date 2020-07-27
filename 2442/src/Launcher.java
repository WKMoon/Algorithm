import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStar = sc.nextInt();
        char star = '*';
        char space = ' ';

        for(int i = 0; i < numStar; i++){
            for(int k = numStar-1-i; k > 0; k--){
                System.out.print(space);
            }//end for
            for(int j = 0; j < i*2+1; j++){
                System.out.print(star);
            }//end for
            System.out.println();
        }//end for

    }
}
