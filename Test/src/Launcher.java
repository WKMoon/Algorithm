import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 45) +1;
            for(int k = 0; k < i; k++){
                if(arr[k] == arr[i]) i--;
            }
        }

        
    }//end void

}//end class

