
import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Launcher {
    static int map[][];
    static int n;
    static int cnt;
    static int start;
    static boolean check[];
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(in.readLine());

        String line[];
        StringBuilder res = new StringBuilder();
        while(t-- >0){
            n = Integer.parseInt(in.readLine());
            map = new int[n+1][n+1];
            check = new boolean[n+1];
            cnt = 0;
            line = in.readLine().split(" ");

            for(int i = 1; i < n+1; i++){
                map[i][Integer.parseInt(line[i])] = 1;
            }//end for
//            2
//            8
            //1 2 3 4 5 6 7 8
//            3 2 7 8 1 4 5 6
            //1-3
            //start = 1 =i , j = 3
//            10
            //1 2 3 4 5 6 7 8 9 10
//            2 1 3 4 5 6 7 9 10 8
            for(int i = 1; i < n+1; i++){
                start = i;
                for(int j = 1; j < n+1; j++){
                    if(!check[j] && map[i][j] == 1){
                        dfs(j);
                    }
                }
            }
            res.append(cnt+"\n");

        }//while
        out.write(res.toString());
        out.close();
        in.close();
    }//end void

    private static void dfs(int j){
        check[j] = true;
        if(j == start){
            cnt++;
            return;
        }
        else{
            for(int i =1; i < n+1; i++){
                if(!check[i] && map[j][i] == 1){
                    check[i] = true;
                    dfs(i);
                }
            }
        }
    }//end dfs


}//end class