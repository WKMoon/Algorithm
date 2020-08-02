import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }//end for

        for(int i = 0; i < arr.length; i++){
            dp[i] = 1;
            for(int k = 0; k < arr.length; k++){
                if(arr[k] > arr[i]){
                    int temp = dp[k] + 1; //prior index j + 1;
                    dp[i] = Math.max(temp,dp[i]);
                }//end if
            }//end for
        }//end for
        int max = dp[0];
        for(int i=0;i < dp.length;i++){
            if(dp[i] > max){
                max = dp[i];
            }//end if
        }//end for

        System.out.println(max);

    }//end void
}//end class
