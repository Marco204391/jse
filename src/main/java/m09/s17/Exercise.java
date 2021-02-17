package m09.s17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise {
    /**
     * Generate an array that contains only once each value (possibly duplicated) in
     * the input array
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data an array with duplicates
     * @return a stripped copy of the original array
     */
    public Integer[] singles(int[] data) {
        Set<Integer> buffer = new HashSet<Integer>();
        for(int value: data){
            buffer.add(value);
        }
        return buffer.toArray(new Integer[buffer.size()]);
    }

    public static void main(String[] args){
        Integer[] result = new Exercise().singles(new int[]{12, 53, 12, 35});
        System.out.println(Arrays.toString(result));
    }


}
