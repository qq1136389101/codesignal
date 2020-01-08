package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class BishopAndPawnTest {

    @Test
    public void bishopAndPawn() {
        BishopAndPawn bishopAndPawn = new BishopAndPawn();
        assertTrue(bishopAndPawn.bishopAndPawn("a1", "c3"));
        assertFalse(bishopAndPawn.bishopAndPawn("h1", "h3"));
        assertTrue(bishopAndPawn.bishopAndPawn("a5", "c3"));
        assertFalse(bishopAndPawn.bishopAndPawn("g1", "f3"));
        assertTrue(bishopAndPawn.bishopAndPawn("e7", "d6"));
    }
}