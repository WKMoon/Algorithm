import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLen = str.length();
        int lastIdx = 10;
        int startIdx = 0;

        int pack = strLen/10;

        if(strLen <= 100){
            for(int i = 0; i < pack; i++){
                System.out.println(str.substring(startIdx,lastIdx));
                startIdx += 10;
                lastIdx += 10;
            }//end for
            System.out.println(str.substring(pack *10));
        }//end if
    }
}
