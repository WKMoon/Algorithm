import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }//end for

        for(int i = 0; i < n; i++){
            dp[i] = 1; //reset to 1
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i]){
                     int temp = dp[j] + 1; //prior index j + 1;
                    dp[i] = Math.max(temp,dp[i]); //
                }//end if
            }//end for
        }//end for

        int result = Integer.MIN_VALUE;

        for(int a : dp){
            result = Math.max(a, result);
        }//end for

        System.out.println(result);
    }//end void
}//end class
