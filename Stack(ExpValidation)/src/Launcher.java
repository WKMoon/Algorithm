import java.util.*;

public class Launcher {

    public static void main(String[] args) {
        if(args.length !=1){
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example: java ExpValidCheck \"((2+3)*1)+3\"");
            System.exit(0);
        }


        Stack st = new Stack();
        String expression = args[0];

        System.out.println("Expression: "+expression);

        try{
            for(int i=0; i < expression.length(); i++){
                char ch = expression.charAt(i);
                if(ch=='(')
                    st.push(ch+"");
                else if(ch==')')
                    st.pop();
            }
            if(st.isEmpty())
                System.out.println("Bracket matched");
            else
                System.out.println("Bracket didn't match");
        }catch(EmptyStackException e){
            System.out.println("Bracket didn't match");
        }



    }
}