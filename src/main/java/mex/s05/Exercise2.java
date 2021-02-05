package mex.s05;

public class Exercise2 {
    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
            if(s==null||s.isBlank()||s.isEmpty())
                return false;
            int l=s.length();
            if (!s.substring(0,1).equals(s.substring(l-1,l)))
                    return false;
                else
                    return true;
            }
}
