package com.mybenefit.p1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RT5 {

    // find the correct number
    @Test
    public void rt5_1()  {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int result = 0;
        boolean expected = guessTheNumber.guess(result);
        assertTrue(expected);
    }

    private final class GuessTheNumber{

        private static final int MIN = 0;
        private static final int MAX = Integer.MAX_VALUE;
        private int searchedNumber;

        GuessTheNumber(){
            searchedNumber = (int) ((Math.random() * (MAX - MIN)) + MIN);
        }

        int checkNumber(int guess) {
            return Integer.compare(guess, searchedNumber);
        }

        boolean guess(int guess){
            if (guess != searchedNumber){
                throw new RuntimeException("WRONG");
            } else {
                return true;
            }
        }

    }
}
