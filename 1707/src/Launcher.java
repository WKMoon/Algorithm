import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList<Integer>> als;

    static final int R = 1;
    static final int B = -1;
    static int[] colors;
    static boolean check;

    public static void main(String[] args) {
        int tc = sc.nextInt();
        while(tc-- > 0){
            int v = sc.nextInt();
            int e = sc.nextInt();

            als = new ArrayList<>();
            colors = new int[v+1];
            check = true;

            //reset
            for(int i = 0; i < v+1; i++){
                als.add(new ArrayList<Integer>());
                colors[i] = 0;
            }//end for

            while(e-- > 0){
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();

                als.get(v1).add(v2);
                als.get(v2).add(v1);
            }//end while

            for(int i = 1; i < v+1; i++){
                if(!check)
                    break;

                if(colors[i] == 0){
                    dfs(i,R);
                }//end if
            }//end for
            System.out.println();
            System.out.print(check ? "YES" : "NO");
        }//end while
    }//end void

    private static void dfs(int startV, int color){
        colors[startV] = color;
        for(int adjV : als.get(startV)){
            if(colors[adjV] == color){
                check = false;
                return;
            }//end if

            if(colors[adjV] == 0){
                dfs(adjV, -color); //change to red or blue (1 || -1)
            }//end if
        }//end for

    }//end dfs
}//end class
