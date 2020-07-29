import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pNum = sc.nextInt();
        int[] arr = new int[91];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        int result = 0;

        if(pNum == 2){
            System.out.println(1);
        }
        else if(pNum == 3){
            System.out.println(2);
        }

        for(int i = 4; i < 90; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }//end for
        System.out.println(arr[pNum]);

    }//end void
}//end class
