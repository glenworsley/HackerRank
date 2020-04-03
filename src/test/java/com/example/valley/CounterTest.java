package com.example.valley;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    private final Counter counter = new Counter();

    @Test
    public void countSingleValley() {

        assertThat(counter.count(4, "DDUU"), is(equalTo(1)));
    }

    @Test
    public void countSingleHill() {

        assertThat(counter.count(4, "UUDD"), is(equalTo(0)));
    }

    @Test
    public void countHillThenValley() {

        assertThat(counter.count(8, "UUDDDDUU"), is(equalTo(1)));
    }

    @Test
    public void countMultipleValleys() {

        assertThat(counter.count(16, "UUDDDDUUUUDDDDUU"), is(equalTo(2)));
    }
}