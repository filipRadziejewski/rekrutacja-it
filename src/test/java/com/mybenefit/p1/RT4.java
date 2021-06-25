package com.mybenefit.p1;



import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RT4 {

    List<String> list1 = new ArrayList<>();
    private static final int NUMBER = 10;

    @Test
    public void rt4_1() throws InterruptedException {
        Thread thread1 = new Thread(this::addToList);
        Thread thread2 = new Thread(this::addToList);
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        int expected = 0;
        assertThat(list1.size(), is(equalTo(expected)));
    }

    private void addToList() {
        for (int i = 0; i < NUMBER; i++) {
            if (list1.size() < NUMBER) {
                list1.add("a");
            }
        }
    }
}
