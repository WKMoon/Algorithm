import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stair = new int[n+1];
        int[] dp = new int[n];

        for(int i = 1; i < stair.length; i++){
            stair[i] = sc.nextInt();
        }//end for

        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];
        dp[3] = Math.max(stair[1] + stair[3], stair[2] + stair[3]);//If it's taken only 3 stairs.

        for(int k = 4; k < dp.length; k++){
            dp[k] = Math.max(dp[k-2]+dp[k],dp[k-3]+dp[k-1]+dp[k]);
        }//end for

        System.out.println(dp[n-1]);
    }//end void
}//end class
