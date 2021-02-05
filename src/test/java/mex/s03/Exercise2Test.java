package mex.s03;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import m07.s06.Simple;

class Exercise2Test {
    @Test
    void isOddTrue() {
        boolean actual = Exercise2.isOdd(19);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

    @Test
    void isOddFalse() {
        boolean actual = Exercise2.isOdd(-12);
        boolean expected = false;

        assertThat(actual, is(expected));
    }
    
    @Test
    void isOddZero() {
            try {
            	Exercise2.isOdd(0);
                fail("An IllegalArgumentException was expected");
            } catch (IllegalArgumentException iae) {
                String message = iae.getMessage();
                assertThat(message, is("Zero not valid"));
            }
 
    }
}
