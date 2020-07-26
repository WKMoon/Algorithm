import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Pick a number for dice. It will never end until you get this.");
            int userPick = sc.nextInt();
            if(userPick < 1 || userPick > 6){
                System.out.println("Invalid input. The number must be from 1 to 6");
                continue;
            }//end if
            int randNum = (int)(Math.random()*6)+1;
            System.out.println("Dice is rolled...");
            if(randNum != userPick){
                System.out.println("Wrong Number. Dice number was " +randNum+ "."+" Try again");
                continue;
            }//end if
            else{
                System.out.println("You won!!! Dice number was "+randNum+".");
                break;
            }//end else
        }//while end
    }//end main
}//end class
