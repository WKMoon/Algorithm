import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Launcher {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = sc.nextInt();

        ArrayList<Object []> al = new ArrayList<Object []>();

        for(int i = 0; i < n; i++){
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            Object[] person = new Object[3];
            person[0] = Integer.parseInt(st.nextToken());
            person[1] = st.nextToken();
            person[2] = cnt++;
            al.add(person);
        }//end for

        for(int i = al.size()-1; i > 0; i--){
            for(int k = 0; k < al.size()-1; k++){
                Object[] arr1 = al.get(k);
                Object[] arr2 = al.get(k+1);
                if((int)arr1[0] > (int)arr2[0]){
                    al.set(k+1, arr1);
                    al.set(k, arr2);
                }//end if
                else if((int)arr1[0] == (int)arr2[0]){
                    if((int)arr1[2] > (int)arr2[2]){
                        al.set(k+1, arr1);
                        al.set(k, arr2);
                    }//end if
                }//end else if
            }//end for
        }//end for

        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i)[0] + " "+ al.get(i)[1]);
        }//end for
    }//end main
}//end class
