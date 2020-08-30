import java.util.ArrayList;
import java.util.Scanner;

public class Launcher {
    static int w, h, cnt;
    static int[][] map;
    static boolean[][] check;
    static int[] dr = {1,0,-1,0,-1,-1,1,1};
    static int[] dc = {0,1,0,-1,-1,1,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();

            while(true){
                w = sc.nextInt();//col
                h = sc.nextInt();//row

                if(w == 0 && h == 0){
                    System.out.println(list);
                    break;
                }//end if

                map = new int[h][w];
                check = new boolean[h][w];
                cnt = 0;

                for(int i = 0; i < h; i++){
                    for(int j = 0; j < w; j++){
                        map[i][j] = sc.nextInt();
                    }//end for
                }//end for

                for(int i = 0; i < h; i++){
                    for(int j = 0; j < w; j++){
                        if(map[i][j] == 1 && !check[i][j]){
                            dfs(i,j);
                            cnt++;
                        }//end if
                    }//end for
                }//end for
                list.add(cnt);
            }//end while
    }//end main

    private static void dfs(int i, int j){
        check[i][j] = true;
        for(int l = 0; l < 8; l++){
            int nr = i + dr[l];
            int nc = j + dc[l];

            if(nr >= 0 && nr < h && nc >= 0 && nc < w && map[nr][nc] == 1 && !check[nr][nc]){
                dfs(nr, nc);
            }//end if
        }//end for
    }//end dfs
}//end class
