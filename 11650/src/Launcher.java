import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<int []> ar = new ArrayList<int []>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int[] point = new int[2];
            point[0] = Integer.parseInt(st.nextToken());
            point[1] = Integer.parseInt(st.nextToken());
            ar.add(point);
        }//end for

        for(int k = ar.size()-1; k > 0; k--)
            for(int i = 0; i < ar.size()-1; i++){
                int[] arr1 = ar.get(i);
                int[] arr2 = ar.get(i+1);

                if(arr1[0] > arr2[0]){
                    int[] t = arr1;
                    ar.set(i,arr2);
                    ar.set(i+1,t);
                }//end if
                else if(arr1[0] == arr2[0]){
                    if(arr1[1] > arr2[1]){
                        int[] t = arr1;
                        ar.set(i,arr2);
                        ar.set(i+1,t);
                    }//end if
                }//end else if
            }//end for

        for(int i=0;i<ar.size();i++) {
            System.out.println(ar.get(i)[0]+" "+ar.get(i)[1]);
        }//end for
    }//end main
}//end class