import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();//month
        int y = sc.nextInt();//date

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for(int i = 0; i < x; i++){
            sum += month[i];
        }
        sum += y;
        System.out.println(day[sum%7]);
    }
}
