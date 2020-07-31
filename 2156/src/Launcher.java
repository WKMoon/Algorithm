import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i <= n; i++){arr[i] = sc.nextInt();}

        if(n>=1) dp[1] = arr[1];
        if(n>=2) dp[2] = arr[1] + arr[2];
        if(n>=3){
            dp[3] = Math.max(dp[2], arr[2]+arr[3]);//arr[1]+arr[2], arr[2]+arr[3]
            dp[3] = Math.max(dp[3], arr[1]+arr[3]);//from top line
        }

        for(int i = 4; i <= n; i++){
            dp[i] = Math.max(arr[i]+dp[i-2], arr[i]+arr[i-1]+dp[i-3]);
            dp[i] = Math.max(dp[i],dp[i-1]);
        }//end for
        System.out.println(dp[n]);

    }//end void
}//end class

