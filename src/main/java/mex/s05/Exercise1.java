package mex.s05;

public class Exercise1 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
