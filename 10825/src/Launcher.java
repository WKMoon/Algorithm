import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Launcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        ArrayList<Object[]> al = new ArrayList<Object[]>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            Object[] arr = new Object[4];
            arr[0] = st.nextToken();
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            arr[3] = Integer.parseInt(st.nextToken());

            al.add(arr);
        }//end for


        for(int i = al.size()-1; i > 0; i--) {
            for (int k = 0; k < al.size() - 1; k++) {
                Object[] arr1 = al.get(k);
                Object[] arr2 = al.get(k+1);

                if((int)arr1[1] < (int)arr2[1]){
                    al.set(k, arr2);
                    al.set(k+1, arr1);
                }//end if
                else if((int)arr1[1] == (int)arr2[1]){
                    if((int)arr1[2] > (int)arr2[2]){
                        al.set(k, arr2);
                        al.set(k+1, arr1);
                    }//end if
                    else if((int)arr1[2] == (int)arr2[2]){
                        if((int)arr1[3] < (int)arr2[3]){
                            al.set(k, arr2);
                            al.set(k+1, arr1);
                        }//end if
                        else if((int)arr1[3] == (int)arr2[3]){
                            if(((int)((String)arr1[0]).charAt(0)) > (((int)((String)arr2[0]).charAt(0)))){
                                al.set(k, arr2);
                                al.set(k+1, arr1);
                            }//end if
                        }//end else if
                    }//end else if
                }//end else if
            }//end for
        }//end for

        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i)[0] + " " + al.get(i)[1] +  " " + al.get(i)[2] +  " " + al.get(i)[3]);
        }//end for

    }//end main
}//end class

