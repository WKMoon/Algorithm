import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = -1;
        int tmp = 0;
        int ans = 0;

        for(int i = 0; i < n; i++){
            try{
                tmp = sc.nextInt();
                map.put(tmp, map.get(tmp)+1);
            }catch(Exception e){
                map.put(tmp,1);
            }
            if(map.get(tmp) >= max){
                if(map.get(tmp) == max){
                    if(tmp < ans)//get smaller number if numbers are same
                        ans = tmp;
                }//end if

                else{
                    max = map.get(tmp);//update max number
                    ans = tmp;
                }//end else
            }//end if
        }//end for

        System.out.println(ans);

    }//end main
}//end class
