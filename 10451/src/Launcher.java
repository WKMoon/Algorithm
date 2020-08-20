import java.io.*;

public class Launcher {
    static int map[][];
    static int n;
    static int cnt;
    static int start;

    static boolean visit[];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(in.readLine());
        String line[];
        StringBuilder res = new StringBuilder();
        while(t-- >0){
            n = Integer.parseInt(in.readLine());
            map = new int[n][n];
            visit = new boolean[n];
            cnt = 0;
            line = in.readLine().split(" ");
            for(int i = 0; i < n; i++){
                map[i][Integer.parseInt(line[i])-1] = 1;
            }//end for
            for(int i = 0; i<n; i++){
                start = i;
                for(int j = 0; j < n; j++){
                    if(!visit[j] && map[i][j] == 1) dfs(j);
                }//end for
            }//end for
            res.append(cnt+"\n");
        }//end while
        out.write(res.toString());
        out.close();
        in.close();
    }//end void

    private static void dfs(int a){
        visit[a] = true;
        if(a == start){
            cnt++;
            return;
        }//end if
        else{
            for(int i = 0; i < n; i++){
                if(!visit[i] && map[a][i] == 1){
                    visit[i] = true;
                    dfs(i);
                }//end if
            }//end for
        }//end else
    }///end dfs
}//end class
