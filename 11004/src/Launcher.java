import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] n = new int[2];
        int ans = 0;
        for(int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(st1.nextToken());
        }//end for

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n[0]];
        for(int i = 0; i < n[0]; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }//end for

        for(int i = 0; i < n[0]; i++){
            if(arr[i] == n[1]){
                ans = i;
            }//end if
        }//end for
        System.out.println(ans);
    }//end main
}//end class
