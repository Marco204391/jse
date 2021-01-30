package m02.s10.ex;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        boolean[] flags = { true, false, false, true, false };

        for(int i=0; i<flags.length;i++) {
        	flags[i]=!flags[i];
        	}
        System.out.println(Arrays.toString(flags));
    }
}
