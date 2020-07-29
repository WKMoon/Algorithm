import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dpArr = new int[num+1];

        if(num == 1){
            System.out.println(0);
            System.exit(0);
        }
        if(num == 2){
            System.out.println(1);
            System.exit(0);
        }

        dpArr[1] = 0;
        dpArr[2] = 1;
        dpArr[3] = 1;

        for(int i = 4; i <= num; i++){
            if(i % 3 == 0){
                dpArr[i] = Math.min(dpArr[i/3], dpArr[i-1])+1;
            }
        }
    }
}

