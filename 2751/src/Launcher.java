import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }//end for

        for(int i = n-1; i > 0; i--){
            for(int k = 0; k < n-1; k++){
                if(arr[k] > arr[k+1]){
                    int t = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = t;
                }//end if
            }//end for
        }//end for

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }//end main
}//end class
