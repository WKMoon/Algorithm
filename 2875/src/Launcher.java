import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int team = 0;

        if(n - m >= m){ //female rate is higher
            n -= k;
            team = n/2;
        }//end if
        else if(n - m < m){ //male rate is higher
             m -= k;
             team = m;
        }//end else if

        System.out.println(team);




    }//end main
}//end class
