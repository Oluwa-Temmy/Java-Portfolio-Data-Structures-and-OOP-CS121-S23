import java.util.Stack;

public class BalancedBrackets {


    public String checkBalance(String brackets){
        Stack <Character> de_staq = new Stack<>();
        for (int i = 0; i<brackets.length(); i++){
            char c = brackets.charAt(i);
            if (c == '('){
                de_staq.push(c);
            } else if (c ==')'){
                if (!de_staq.empty() || de_staq.peek() == '('){
                    de_staq.pop();
                }
                else {
                    de_staq.push(c);
                }
            }
            else{
                de_staq.pop();
            }
        }
        if (de_staq.empty()){
            return "balanced";
        }
        else {
            return "unbalanced";
        }
    }
}
