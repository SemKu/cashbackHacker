package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = bonus.remain(amount);
        assertEquals(actual, expected);

    }
    @org.junit.Test
    public void testRemain1000() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = bonus.remain(amount);
        assertEquals(actual, expected);

    }
}