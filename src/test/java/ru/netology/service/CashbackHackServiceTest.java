package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = bonus.remain(amount);
        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testRemain1000() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = bonus.remain(amount);
        assertEquals(actual, expected);

    }
}