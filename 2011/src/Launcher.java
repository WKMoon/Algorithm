import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strNum = sc.next();

    int[] dp = new int[strNum.length() + 1];
        dp[0] = dp[1] = 1;

        for(int i = 2; i <= strNum.length(); i++){
            int now = i-1;
            if(strNum.charAt(now) != '0'){
                dp[i] = dp[i-1];
            }//end if
            int x = (strNum.charAt(now-1)-'0') * 10 + (strNum.charAt(now) - '0');
            if(x >= 10 && x <= 26){
                dp[i] = (dp[i] + dp[i-2])%1000000;
            }//end if
        }//end for
        System.out.println(strNum.equals("0") ? 0 : dp[strNum.length()]);

    }//end void
}//end class
//https://mizzo-dev.tistory.com/entry/baekjoon2011
