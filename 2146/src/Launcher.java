import com.sun.org.apache.xpath.internal.operations.String;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Launcher {
    static int num;
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int cnt = 1;
    static int result = 100000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        check = new boolean[num][num];
        arr = new int[num][num];

        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < num; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }//end for
        }//end for

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(arr[i][j] == 1){
                    cnt++;
                    arr[i][j] = cnt;
                    dfs(i,j);
                }//end if
            }//end for
        }//end for

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(arr[i][j] != 0){
                    bfs(i,j);
                    for(boolean[] row: check){
                        Arrays.fill(row,false);
                    }//end for
                }//end if
            }//end for
        }//end for
        System.out.println(result);
    }//end main

    private static void dfs(int x, int y){
        for(int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 & nextY >= 0 && nextX < num && nextY < num){
                if(arr[nextX][nextY] == cnt) continue;
                if(arr[nextX][nextY] == 0) continue;
                arr[nextX][nextY] = cnt;
                dfs(nextX,nextY);
            }//end if
        }//end for
    }//end dfs

    private static void bfs(int x, int y){
        int nx = x;
        int ny = y;
        Queue<int []> q = new LinkedList<>();
        q.add(new int[] {x, y, 0});

        while(!q.isEmpty()){
            int[] point = q.poll();
            for(int i = 0; i < 4; i++){
                int nextX = point[0] + dx[i];
                int nextY = point[1] + dy[i];
                int nextCnt = point[2] + 1;

                if(nextX >= 0 && nextY >= 0 && nextX < num && nextY < num){
                    if(arr[nextX][nextY] == arr[nx][ny]) continue;
                    if(check[nextX][nextY]) continue;
                    if(arr[nextX][nextY] != 0){
                        result = Math.min(result, nextCnt - 1);
                        return;
                    }//end if
                    check[nextX][nextY] = true;
                    q.add(new int[] {nextX,nextY,nextCnt});
                }//end if
            }//end for
        }//end while
    }//end bfs
}//end class
