import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int tmp = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] minute = new int[n];
        for(int i = 0; i < n; i++){
            minute[i] = Integer.parseInt(st.nextToken());
        }//end for

        Arrays.sort(minute);

        for(int i = 0; i < minute.length; i++){
            tmp += minute[i];
            sum += tmp;
        }//end for

        System.out.println(sum);

    }//end main
}//end class
