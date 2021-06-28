package com.mybenefit.p1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RT5 {

    @Test
    public void rt5_1()  {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int result = 0;
        boolean expected = guessTheNumber.guess(result);
        assertTrue(expected);
    }


    private final class GuessTheNumber{

        private static final int MIN = 0;
        private static final int MAX = 10000000;
        int i;

        GuessTheNumber(){
            i = (int) ((Math.random() * (MAX - MIN)) + MIN);
        }

        final int checkNumber(int num) {
            if (num < i) {
                return -1;
            } else if (num > i) {
                return 1;
            } else {
                return 0;
            }
        }

        final boolean guess(int num){
            if (num != i){
                throw new RuntimeException("WRONG");
            } else {
                return true;
            }
        }

    }
}
