package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void calculateCashback() {
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}