package com.mybenefit.p1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RT1 {

    @Test
    public void test1() {
        String expected = "";

        // test
        assertThat("test", is(equalTo(expected)));
    }

    @Test
    public void test2() {
        String expected = "";

        // test
        assertThat(new String("test"), is(equalTo(expected)));
    }

    @Test
    public void test3() {
        String expected = "";

        // test
        assertThat(getActual3(), is(equalTo(expected)));
    }

    private String getActual3() {
        return "test3";
    }

    @Test
    public void test4() {
        String expected = "";

        String actual = "test";
        addBis4(actual);

        // test
        assertThat(actual, is(equalTo(expected)));
    }

    private void addBis4(String expected) {
        expected.concat("bis");
    }

    @Test
    public void test5() {
        String expected = "";


        String actual = "test";
        addBis5(actual);

        // test
        assertThat(actual, is(equalTo(expected)));
    }

    private void addBis5(String actual) {
        actual = actual.concat("bis");
    }

    @Test
    public void test6() {
        int expected = 0;

        int actual = 0;
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                actual = actual + k;
                if (k == 1) {
                    break;
                }
            }
        }
        assertThat(actual, is(equalTo(expected)));
    }
}
