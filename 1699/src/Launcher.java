import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[100000];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 1;
        for(int i = 5; i <= n; i++){
            dp[i] = dp[i-4] + 1;
        }//end for

        System.out.println(dp[n]);

    }//end void
}//end class
