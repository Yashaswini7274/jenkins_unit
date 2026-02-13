package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreatestTest {

    @Test
    public void testNum3Greatest() {
        assertEquals(30, Greatest.findGreatest(10, 20, 30));
    }

    @Test
    public void testNum2Greatest() {
        assertEquals(50, Greatest.findGreatest(10, 50, 30));
    }

    @Test
    public void testNum1Greatest() {
        assertEquals(100, Greatest.findGreatest(100, 20, 30));
    }

    @Test
    public void testAllEqual() {
        assertEquals(10, Greatest.findGreatest(10, 10, 10));
    }
}

