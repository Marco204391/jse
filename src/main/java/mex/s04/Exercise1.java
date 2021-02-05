package mex.s04;

public class Exercise1 {
    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first the leftmost value
     * @param last  the rightmost value
     * @return the sum of all the numbers, or zero
     */
    public static long sum(int first, int last) {
        long sum=0;
        if(first>last) {
            return 0;
        }
        for(int i=first;i<=last; i++){
                sum += i;
        }
        return sum;
    }
}
