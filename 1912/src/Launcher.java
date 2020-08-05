import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 0;
        }//end for

        for(int i = 0; i < arr.length-1; i++){
            for(int k = i+1; k < arr.length; k++){
                if(dp[i] + arr[k] > dp[i]){//compare number using current amount of number with current index
                    dp[i] += arr[k];
                }//end if
                else{
                    break;
                }//end else
            }//end for
        }//end for

        Arrays.sort(dp);
        System.out.println(dp[n-1]);

    }//end void
}//end class
