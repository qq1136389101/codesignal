package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepositProfitTest {

    @Test
    public void depositProfit() {
        DepositProfit depositProfit = new DepositProfit();
        assertEquals(3, depositProfit.depositProfit(100, 20, 170));
        assertEquals(1, depositProfit.depositProfit(100, 1, 101));
        assertEquals(6, depositProfit.depositProfit(1, 100, 64));
        assertEquals(6, depositProfit.depositProfit(20, 20, 50));
        assertEquals(4, depositProfit.depositProfit(50, 25, 100));
        assertEquals(533, depositProfit.depositProfit(1, 1, 200));
    }
}