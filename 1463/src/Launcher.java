import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dpArr = new int[num+1];//start from 1 for convenient.

        if(num == 1){
            System.out.println(0);
            System.exit(0);
        }//end if

        if(num == 2){
            System.out.println(1);
            System.exit(0);
        }

        dpArr[1] = 0;
        dpArr[2] = 1;//remain by 2
        dpArr[3] = 1;//remain by 3

        for(int i = 4; i <= num; i++){
            if(i%3 == 0){
                dpArr[i] = Math.min(dpArr[i/3], dpArr[i-1]) + 1;//Count 1 more
            }//end if
            else if(i%2 == 0){
                dpArr[i] = Math.min(dpArr[i/2], dpArr[i-1]) + 1;//Count 1 more
            }//end if
            else{
                dpArr[i] = dpArr[i-1] + 1;
            }//end else
        }//end for
        System.out.println(dpArr[num]);
    }//end void
}//end class
