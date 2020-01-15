package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElectionsWinnersTest {

    @Test
    public void electionsWinners() {
        ElectionsWinners electionsWinners = new ElectionsWinners();
        assertEquals(2, electionsWinners.electionsWinners(new int[]{2, 3, 5, 2}, 3));
        assertEquals(0, electionsWinners.electionsWinners(new int[]{1, 3, 3, 1, 1}, 0));
        assertEquals(1, electionsWinners.electionsWinners(new int[]{5, 1, 3, 4, 1}, 0));
        assertEquals(4, electionsWinners.electionsWinners(new int[]{1, 1, 1, 1}, 1));
        assertEquals(2, electionsWinners.electionsWinners(new int[]{3, 1, 1, 3, 1}, 2));
    }
}