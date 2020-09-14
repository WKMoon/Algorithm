import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int[] result = new int[n.length()];
        int sum = 0;
        if(n == "30")
            System.out.println(n);
        else if(!n.contains("0")){
            System.out.println("here");
            System.out.println("-1");
        }//end else if
        else{
            for(int i = 0; i < n.length(); i++){
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }//end for
            if(sum % 3 != 0){
                System.out.println("there");
                System.out.println("-1");
            }//end if
            else{
                for(int i = 0; i < result.length; i++){
                    result[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
                }//end for
            }//end else
        }//end else
        Arrays.sort(result);
        for(int i = result.length -1; i >= 0; i--){
            System.out.print(result[i]);
        }//end for

    }//end main
}//end class
