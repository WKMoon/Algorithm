import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int year = 0;

        int ec = 0;
        int sc = 0;
        int mc = 0;

        while(true){
            if(e == ec && s == sc && m == mc){
                System.out.println(year);
                break;
            }//end if
            else{
                ec++;
                sc++;
                mc++;
            }//end else
            if(ec > 15) ec = 1;
            if(sc > 28) sc = 1;
            if(mc > 19) mc = 1;
            year++;
        }//end while


    }//end main
}//end class
