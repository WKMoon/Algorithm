import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dp = new int[n+1][10];
        for(int i = 0; i <= 9; i++){
            dp[1][i] = 1;
        }//end for

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= j; k++){
                    dp[i][j] += dp[i-1][k];
                }//end for
            }//end for
        }//end for

        long result = 0;
        for(int i = 0; i <= 9; i++){
            System.out.println(dp[n][i]);
            result += dp[n][i];
        }//end for

        System.out.println(result);
    }//end void
}//end class
