import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Launcher {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("Type help to see features");

        while(true){
            System.out.print(">>");
            try{
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();

                if("".equals(input))
                    continue;

                if(input.equalsIgnoreCase("q")){
                    System.exit(0);
                }
                else if(input.equalsIgnoreCase("help")){
                    System.out.println("help - show features");
                    System.out.println("q - terminate program");
                    System.out.println("history - show"+ MAX_SIZE +"command line which user has used");
                }
                else if(input.equalsIgnoreCase("history")){
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator li = tmp.listIterator();

                    while(li.hasNext()){
                        System.out.println(++i + "." + li.next());
                    }//while
                }//end else if

                else{
                    save(input);
                    System.out.println(input);
                }//end else


            }catch(Exception e){
                System.out.println("Wrong input");
            }

        }//end while
    }//end main

    public static void save(String input){
        if(!"".equals(input)){
            q.offer(input);
        }
        if(q.size()>MAX_SIZE)
            q.remove();
    }//end save

}//end class
