import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
    static boolean broken[] = new boolean[10];
    public static int possible(int c){
        if(c == 0){
            if(broken[0])
                return 0;
            else return 1;
        }//end if

        int len = 0;
        while(c > 0){
            if(broken[c%10]) return 0;//return 0 for len if c is broken.
            len += 1;//else increase len till c is under than 0
            c /= 10;
        }//end while

        return len;
    }//end possible
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//channel
        int m = sc.nextInt();//num of broken button

        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            broken[x] = true;//broken buttons in boolean array
        }//end for
        int ans = Math.abs(100 - n);

        for(int i = 0; i < 1000000; i++){ //500000 for one way from 100 to 500000
            int c = i;//each channel
            int len = possible(c);//num of click before ++ or --

            if(len > 0){
                int press = c - n;//++ or --
                if(press < 0) press = -press;
                if(ans > len + press) ans = len + press;
            }//end if
        }//end for
        System.out.println(ans);

    }//end main
}//end class
