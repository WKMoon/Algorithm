import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArr = new int[1000];

        numArr[1] = 1;
        numArr[2] = 2;

        for(int i = 3; i <= n; i++){
            numArr[i] = numArr[i-1] + numArr[i-2];
        }//end for

        System.out.println(numArr[n]%10007);
    }//end void
}//end class
