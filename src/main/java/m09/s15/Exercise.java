package m09.s15;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    /**
     * Extract from input the even values and return them in a List
     * 
     * @param data a bunch of integers
     * @return even values from input
     * 
     *         example: in {2, 3, 4, 5} -> out {2, 4}
     */
    public List<Integer> evens(int[] data) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : data){
            if(i%2==0){
                list.add(i);
            }
        }
        return list;
    }

    /**
     * Do not use collection
     *
     * @param data
     * @return
     */
    public int[] evensRaw(int[] data) {
        int count=0;
        for(int i : data){
            if(i%2==0){
               count++;
            }
        }
        int result[]= new int[count];
        int j=0;
        for(int i : data){
            if(i%2==0){
                result[j]=i;
                j++;
            }
        }
        return result;
    }

    /**
     * Extract non-duplicated values in input and return them in a list
     * 
     * @param data a bunch of integers
     * @return only the non-duplicated values from input
     * 
     *         example: in {2, 3, 4, 4, 5, 5, 2, 6, 7} -> out {2, 3}
     */
    public List<Integer> singles(int[] data) {
        final List<Integer> result = new ArrayList<Integer>();
        final List<Integer> doppioni = new ArrayList<Integer>();
        boolean duplicato = false;

        for(int i=0; i<=data.length; i++){
            for(int j=i+1; i<=data.length; i++){
                if(!doppioni.contains(data[i])&&data[i]==data[j]) {
                    doppioni.add(data[i]);
                    duplicato = true;
                    break;
                }
            }
            if(!duplicato){
                result.add(data[i]);
            }
        }
        return result;
    }
    /**
     * As above, but with a linear time algorithm
     * 
     * @param data
     * @return
     */
    public List<Integer> singlesLinear(int[] data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static void main(String[] args) {
        Exercise ex = new Exercise();
        System.out.println(ex.singlesLinear(new int[] { 2, 3, 4, 4, 5, 6 }));
    }
}
