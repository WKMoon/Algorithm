import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;

        while(true){
            int randNum = (int)(Math.random()*3)+1;
            System.out.println(randNum);
            System.out.println("Pick a number. (Scissors=1, Rock=2, Paper=3)");
            int userPick = sc.nextInt();
            if(userPick < 1 || userPick > 3){
                System.out.println("Invalid Input. Number must be from 1 to 3. Try again");
                continue;
            }//end if

            if(userPick == 1){
                switch (randNum){
                    case 1:
                        System.out.println("Draw. Try again");
                        System.out.println("Computer: Scissors");
                        System.out.println("User: Scissors");
                        break;
                    case 2:
                        System.out.println("You lost!!");
                        System.out.println("Computer: Rock");
                        System.out.println("User: Scissors");
                        break;
                    case 3:
                        System.out.println("You won!!");
                        System.out.println("Computer: Paper");
                        System.out.println("User: Scissors");
                        bool = false;
                        break;
                }//end switch
            }//endif
            else if(userPick == 2){
                switch (randNum){
                    case 1:
                        System.out.println("You won!!");
                        System.out.println("Computer: Scissors");
                        System.out.println("User: Rock");
                        bool = false;
                        break;
                    case 2:
                        System.out.println("Draw. Try again");
                        System.out.println("Computer: Rock");
                        System.out.println("User: Rock");
                        break;
                    case 3:
                        System.out.println("You lost!!");
                        System.out.println("Computer: Paper");
                        System.out.println("User: Rock");
                        break;
                }//end switch
            }//end else if
            else{
                switch (randNum){
                    case 1:
                        System.out.println("You lost!!");
                        System.out.println("Computer: Scissors");
                        System.out.println("User: Paper");
                        break;
                    case 2:
                        System.out.println("You won!!");
                        System.out.println("Computer: Rock");
                        System.out.println("User: Paper");
                        bool = false;
                        break;
                    case 3:
                        System.out.println("Draw. Try again");
                        System.out.println("Computer: Paper");
                        System.out.println("User: Paper");
                        break;
                }//end switch
            }//end else

            if(bool == false){
                break;
            }//end
        }//end while

    }//end main
}//end void
