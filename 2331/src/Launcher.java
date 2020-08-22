
import java.io.*;
import java.util.StringTokenizer;

public class Launcher {
    static int R;
    static int[] arr;
    static boolean[] visited; //just normal checking
    static boolean[] check; //checking cycle
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0){
            R = Integer.parseInt(br.readLine());
            arr = new int[R+1];

            visited = new boolean[R+1];
            check = new boolean[R+1];

            result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 1; i <= R; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }//end for

            for(int i = 1; i <= R; i++){
                if(!check[i]){
                    dfs(i);
                }//end if
            }//end for
            System.out.println(R-result);
        }//end while
    }//end void


    private static void dfs(int n){
        visited[n] = true;
        int next = arr[n];

        if(!visited[next]){
            dfs(next);
        }//end if
        else{ //if visited[next] == true;
            if(!check[next]){
                for(int i = next; ; i= arr[i]){
                    result++;
                            if(i==n) break;
                }//end for
            }//end if
        }//end else
        check[n] = true;//convert to true until checked so far
    }//end dfs
}//end class