import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStar = sc.nextInt();
        char star = '*';
        char space = ' ';

        for(int i = 1; i <= numStar; i++){
            for(int k = numStar; k > i; k--){
                System.out.print(space);
            }//end for
            for(int j = 0; j < i; j++){
                System.out.print(star +""+ space);
            }//end for
            System.out.println();
        }//end for
    }
}
