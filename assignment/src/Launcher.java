import java.util.*;

public class Launcher {

    public static void main(String[] args) {
        int kor = 90;
        int eng = 70;
        int math = 85;

        int sum = kor + eng + math;
        int aver = sum/3;

        System.out.println("국어: " + kor + "점");
        System.out.println("영어: " + eng + "점");
        System.out.println("수학: " + math + "점");

        System.out.println("총점: " +sum + "점");
        System.out.println("평균: " +aver + "점");

    }//end main
}//end Launcher