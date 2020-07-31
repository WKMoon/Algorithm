import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[][] = new long[n+1][10];

        for(int i = 1; i <= 9; i++){
            dp[1][i] = 1;//reset to 1 for 1 digit numbers
        }

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j++){
                dp[i][j] = 0;//reset first
                //more than 0 //
                if(j - 1 >= 0){
                    dp[i][j] += dp[i-1][j-1];
                }//end if
                //less than 9
                if(j + 1 <= 9){
                    dp[i][j] += dp[i-1][j+1];
                }

            }//end for
        }//end for

        long stairNum = 0;
        for(int i = 0; i <= 9; i++){
            stairNum += dp[n][i];
        }//end for
        System.out.println(stairNum);
    }//end void

}//end class

