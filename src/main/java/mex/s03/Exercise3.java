package mex.s03;

public class Exercise3 {
    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "other"};
        if(value<10&&value>=0){
            return number[value];
        }
        return number[10];
    }
}
