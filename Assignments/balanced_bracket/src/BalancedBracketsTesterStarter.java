

public class BalancedBracketsTesterStarter {

    public static void main(String[] args)
    {
        BalancedBracketsStarter balanced = new BalancedBracketsStarter();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));



  
    }
}
