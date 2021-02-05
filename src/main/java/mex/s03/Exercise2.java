package mex.s03;

public class Exercise2 {
    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return true if odd
     */
    public static boolean isOdd(int value) {
        boolean b=true;
        if(value>0)
            b = true;
        if(value<0)
            b = false;
        return b;
    }
}
