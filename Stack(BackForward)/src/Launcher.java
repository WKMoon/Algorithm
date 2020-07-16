import java.util.*;

public class Launcher {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();
    public static void main(String[] args) {
        goURL("1.Nate");
        goURL("2.Yahoo");
        goURL("3.Naver");
        goURL("4.Daum");

        printStatus();

        goBack();
        System.out.println("After type back button");
        printStatus();

        goBack();
        System.out.println("After type back button");
        printStatus();

        goForward();
        System.out.println("Afte type forward button");
        printStatus();

        goURL("codechobo.com");
        System.out.println("Move to new website");
        printStatus();
    }

    public static void printStatus(){
        System.out.println("Back: "+back);
        System.out.println("Forward: "+forward);
        System.out.println("Current page is "+back.peek());
        System.out.println();
    }

    public static void goURL(String url){
        back.push(url);
        if(!forward.isEmpty()){
            forward.clear();
        }
    }

    public static void goForward(){
        if(!forward.isEmpty())
            back.push(forward.pop());
    }

    public static void goBack(){
        if(!back.isEmpty())
            forward.push(back.pop());
    }

}