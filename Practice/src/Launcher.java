import com.sun.org.apache.xml.internal.utils.IntStack;
import java.util.*;

public class Launcher {
    static int graph[][];
    static boolean[] check;
    static int n;
    static int m;
    static int cnt1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        check = new boolean[n+1];
        for(int i = 1; i < m+1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }//end for

        for(int i = 1; i < n+1; i++){
            if(!check[i]){
                dfs(i);
                cnt1++;
            }
        }//end for
    }//end void

    public static void dfs(int i){
        check[i] = true;
        for(int j = 1; j < n+1; j++){
            if(graph[i][j] == 1 && check[j] == false){
                dfs(j);
            }//end if
        }//end for
    }//end dfs
}//end class