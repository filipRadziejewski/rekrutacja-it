package com.mybenefit.p1;


import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RT2 {

    @Test
    public void rt2_1(){
        int expected = 0;


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);

        assertThat(list.get(2), is(equalTo(expected)));
    }

    @Test
    public void rt2_2(){
        int expected = 0;

        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);

        assertThat(list.get(2), is(equalTo(expected)));
    }

    @Test
    public void rt2_3(){
        int expected = 0;

        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(1);

        List<Integer> list = new ArrayList<>(set);
        assertThat(list.get(2), is(equalTo(expected)));
    }

    @Test
    public void rt2_4(){
        int expected = 0;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        addToList(list);
        list.add(3);
        list.add(4);

        assertThat(list.get(2), is(equalTo(expected)));
    }

    private void addToList(List<Integer> list) {
        list.add(2);
    }

    @Test
    public void rt2_5(){
        int expected = 0;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = list.stream().map(elem -> elem + 2).collect(Collectors.toList());
        assertThat(list2.get(2), is(equalTo(expected)));
    }

    @Test
    public void rt2_6(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int expected = 0;

        int actual = list.stream().reduce(0, Integer::sum);
        assertThat(actual, is(equalTo(expected)));
    }












    @Test()
    public void rt2_7(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int expected = 0;

        List<Integer> actual = list.stream().filter(elem -> elem == 2).collect(Collectors.toList());
        assertThat(actual.get(2), is(equalTo(expected)));
    }







    @Test(expected = IllegalArgumentException.class)
    public void rt2_8() {
            callSomeMethod();
    }

    private void callSomeMethod() {
        throw new RuntimeException();
    }
}
