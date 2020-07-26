import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] numArr = new int[num];
        int max = 0;
        int min = 0;

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }//end for

        max = numArr[0];
        for(int i = 0; i < numArr.length; i++){
            if(max < numArr[i]){
                max = numArr[i];
            }
        }//end for
        min = numArr[0];
        for(int i = 0; i < numArr.length; i++){
            if(min > numArr[i]){
                min = numArr[i];
            }
        }//end for

        System.out.println(min + " " + max);
    }
}
