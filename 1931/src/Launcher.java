import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][2];
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            for(int j = 0; j < 2; j++){
                list[i][0] = s;
                list[i][1] = e;
            }//end for
        }//end for

        for(int i = 0; i < n; i++){
            for(int k = 0; k < i; k++){
                for(int j = 0; j < 2; j++){
                    if(list[i][1] < list[k][1]){
                        int[] tmp = list[i];
                        list[i] = list[k];
                        list[k] = tmp;
                    }//end if
                    else if(list[i][1] == list[k][1]){
                        if(list[i][0] < list[k][0]){
                            int[] tmp = list[i];
                            list[i] = list[k];
                            list[k] = tmp;
                        }//end if
                    }//end else if
                }//end for
            }//end for
        }//end for

        int start = list[0][1];

        for(int i = 1; i < list.length; i++){
            if(start <= list[i][0]){
                cnt++;
                start = list[i][1];
            }//end if
        }//end for

        System.out.println(cnt);
    }//end main
}//end class
