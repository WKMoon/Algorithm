import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[201][201]; //start from number 1.

        for(int i = 1; i <= k; i++)
            dp[0][i] = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= k; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }//end for
        }//end for

        System.out.println(dp[n][k]);
    }//end void
}//end class
