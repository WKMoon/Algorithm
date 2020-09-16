import java.util.Arrays;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int zero = 0;
        int neg = -1;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }//end for

        Arrays.sort(arr);

        for(int i = n-1; i >= 0; i--){
            if(arr[i] > 1 && i-1 >= 0 & arr[i-1] > 1){
                sum += arr[i] * arr[i-1];
                i--;
            }//end if
            else if(arr[i] == 0){
                zero++;
            }//end else if
            else if(arr[i] < 0){
                neg = i;
                break;
            }//end else if
            else{
                sum += arr[i];
            }//end else
        }//end for

        for(int i = 0; i <= neg; i++){
            if(arr[i] < 0 && i+1 <= neg && arr[i+1] < 0){
                sum += arr[i] * arr[i+1];
                i++;
            }//end if
            else if(zero > 0){
                zero--;
            }//end else if
            else{
                sum += arr[i];
            }//end else
        }//end for
        System.out.println(sum);
    }//end main
}//end class
