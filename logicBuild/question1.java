/*
 125. Valid Palindrome
 A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome
 */

// Time complexity - o(n)
// Space complexity -o(1)
public class question1 {
    /*

    public static boolean palindrome(String s){
     * // IN THIS LINE REPLACE ALL THE NONALPHABETICUL REMOVE IN YOUR STRING
     * String result = s.replaceAll("[^a-zA-Z0-9]", "");
     * System.out.println(result);
     * // CONVERT TO LOWER CASE CHARECTOR
     * result = result.toLowerCase();
     * //CHECK THE GIVEN STRING IS PALINDROME OR NO
     * for(int i = 0;i<= ((result.length())/2);i++){
     * if(result.charAt(i)!=result.charAt(result.length()-1-i)){
     * return false;
     * }
     * }
     * return true;
     * 
}
     */


    public  static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "noon";
        // System.out.println(palindrome(s));
        System.out.println(isPalindrome(s));
    }
}