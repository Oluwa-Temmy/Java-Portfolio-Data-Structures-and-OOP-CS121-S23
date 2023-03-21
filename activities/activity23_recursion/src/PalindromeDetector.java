public class PalindromeDetector {

    String[] wordrow = {"thats debug", "in favorovaf ni", "mcloverevenm", "kayak"};
    private boolean palindrome = false;
    private int wordlen = wordrow.length-1;

    public void isreversed() {
        for (int i = 0; i <= wordlen; ++i) {
            palindrome = isPalindrome(wordrow[i].toLowerCase(), 0, wordrow[i].length() - 1);
            //how do i access the string instead of the list for the palendrome
            if (palindrome) {
                System.out.printf("%s, is a palindrome\n", wordrow[i]);
            } else {
                System.out.printf("%s, is NOT a palindrome\n", wordrow[i]);
            }
        }
    }

    private boolean isPalindrome(String str, int left, int right)
    {
        //Uses two pointers one on left and one on right
        //When the left pointer val is equal to the right val; first letter and last letter
        //Then left goes to next and right goes to prev
        //When the val of the left and right pointer are not equal then it is not a palindrome
        if (left >= right)
        {
            return true;
        }
        //check to see if left and right are equal
        //if they are equal then that means you reached the middle
        //of the list and this is a palindrome

        else if (str.charAt(left) != str.charAt(right))
        {
            return false;
        }
        else
        {
            return isPalindrome(str, left + 1, right - 1);
        }
    }
}
