package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void remain() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = bonus.remain(amount);
        assertEquals(expected, actual);

    }
}