import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Launcher {
    static int n;
    static int m;
    static int cnt1; //count how many connected component.
    static int cnt2; //count how many connected component.
    static int graph[][];
    static boolean check[];//check false or true which is giving to check each node.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i = 1; i < m+1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;//make graph which allow both way. AND connected nodes.
        }//end for

        for(int i = 1; i < n+1; i++){
            if(!check[i]){
                dfs(i);
                cnt1++;
            }//end if
        }//end for

        for(int i = 1; i < n+1; i++){
            if(!check[i]){
                bfs(i);
                cnt2++;
            }//end if
        }//end for

        System.out.println(cnt1);
        System.out.println(cnt2);
    }//end void

    public static void dfs(int i){
        check[i] = true;
        for(int j =1; j < n+1; j++){
            if(graph[i][j] == 1 && check[j] == false){ //connected and never visited node.
                dfs(j);//recursion
            }//end if
        }//end for
    }//end dfs

    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        check[i] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            for(int j = 1; j < n+1; j++){
                if(graph[temp][j] == 1 && check[j] == false){
                    q.offer(j);
                    check[j] = true;
                }//end if
            }//end for
        }//end while
    }//end bfs

}//end class