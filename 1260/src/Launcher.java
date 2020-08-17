import java.util.*;

public class Launcher {
    static ArrayList<Integer>[] list;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        list = new ArrayList[n+1];

        for(int i = 1; i < n+1; i++){
            list[i] = new ArrayList<Integer>();//ArrayLists are in an ArrayList
        }//end for

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            //for each array list which are have both way.
            list[u].add(v);
            list[v].add(u);
        }//end for
        for(int i = 1; i < n+1; i++){
            Collections.sort(list[i]);
        }//end for

        check = new boolean[n+1];
        dfs(start);
        System.out.println();

        check = new boolean[n+1];
        bfs(start);
        System.out.println();
    }//end main

    private static void dfs(int start){
        if(check[start]){
            return;
        }//end if
        check[start] = true;
        System.out.print(start + " ");
        for(int y : list[start]){
            if(!check[y])
                dfs(y); //recursion
        }//end for
    }//end dfs

    private static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
            for(int y : list[x]){
                if(!check[y]){
                    check[y] = true;
                    q.add(y);
                }//end if
            }//end for
        }//end while
    }//end bfs

}//end class
