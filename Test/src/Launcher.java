import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n =  Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < dp.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    int temp =dp[j] + 1;
                    dp[i] = Math.max(temp, dp[i]);
                }//end if
            }//end for
        }//end for

        int result = Integer.MIN_VALUE;

        for(int a : dp){
            result = Math.max(a, result);
        }//end for




    }//end void
}//end class

