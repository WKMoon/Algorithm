import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = sc.nextInt();

        for(int i = 0; i < caseNum; i++){
            int n = sc.nextInt();
            int[] nArr = new int[n+1];//start index from 1

            if(n == 1){
                System.out.println(1);
            }//end if
            else if(n == 2){
                System.out.println(2);
            }//end else if
            else if (n == 3){
                System.out.println(4);
            }//end else if
            else{
                nArr[1] = 1;
                nArr[2] = 2;
                nArr[3] = 4;

                for(int k = 4; k <= n; k++){
                    nArr[k] = nArr[k-1] + nArr[k-2] + nArr[k-3];
                }//end for
                System.out.println(nArr[n]);
            }//end else
        }//end for


    }//end void
}//end class
