import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];

        for(int i = 0; i < coins.length; i++){
            coins[i] = sc.nextInt();
        }//end for

        int i = n - 1;

        while(k != 0){
            if(k - coins[i] > 0){
                cnt++;
                k -= coins[i];
            }//end if
            else if(k - coins[i] == 0){
                cnt++;
                k -= coins[i];
            }//end else if
            else if(k - coins[i] < 0){
                i--; //decrease a index
            }//end else if
        }//end while

        System.out.println(cnt);
    }//end main
}//end class
