package mex.s03;

public class Exercise1 {
    /**
     * Check if the parameter is positive, negative, or zero
     * 
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
        String p= "positive";
        String n= "negative";
        String z= "zero";
        if(value>0){
            return p;
        }else if(value<0){
            return n;
        }else
            return z;
    }
}
