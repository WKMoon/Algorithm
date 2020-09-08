import com.sun.org.apache.xerces.internal.impl.xs.XSAnnotationImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] box = new int[n][m];

        int cnt = 0;
        LinkedList<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < m; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 0){
                    cnt++;
                }//end if
                else if(box[i][j] == 1){
                    q.offer(new int[] {i, j, 0});
                }//end else if
            }//end for
        }//end for

        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};

        while(!q.isEmpty()){
            int r = q.peek()[0];
            int c = q.peek()[1];
            int day = q.poll()[2];

            for(int i = 0; i < 4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr < 0 || nr >= n || nc < 0 || nc >= m || box[nr][nc] == -1){
                    continue;
                }//end if

                if(box[nr][nc] == 0){
                    box[nr][nc] = day+1;
                    cnt--;
                    q.offer(new int[] {nr, nc, day+1});
                }//end if
            }//end for
            if(cnt == 0){
                System.out.println(q.pollLast()[2]);
                System.exit(0);
            }//end if
        }//end while
        if(cnt > 0){
            System.out.println("-1");
        }
    }//end main
}//end class
