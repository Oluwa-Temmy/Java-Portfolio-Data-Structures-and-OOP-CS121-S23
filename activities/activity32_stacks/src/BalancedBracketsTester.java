public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets test = new BalancedBrackets();

        String [] brack_list = {"((((()))))", "()))())))","(((((((",
                "(())()()(())","((((()))))))))"};
        for (int i = 0; i<brack_list.length; i++){
            System.out.printf("Bracket %d, is %s\n",
                    i+1,test.checkBalance(brack_list[i]));
        }

    }
}
