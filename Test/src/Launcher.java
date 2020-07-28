import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];


        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }



        int temp = 0;
        for(int i = 0; i < score.length-1; i++){
            for(int k = 1+i; k < score.length; k++){
                if(score[i] > score[k]){
                    temp = score[i];
                    score[i] = score[k];
                    score[k] = temp;
                }
            }
        }

        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }





    }
}
