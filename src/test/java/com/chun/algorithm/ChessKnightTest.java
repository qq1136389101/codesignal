package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessKnightTest {

    @Test
    public void chessKnight() {
        ChessKnight chessKnight = new ChessKnight();
        assertEquals(2, chessKnight.chessKnight("a1"));
        assertEquals(6, chessKnight.chessKnight("c2"));
        assertEquals(8, chessKnight.chessKnight("d4"));
        assertEquals(6, chessKnight.chessKnight("g6"));
        assertEquals(4, chessKnight.chessKnight("a3"));
        assertEquals(4, chessKnight.chessKnight("b7"));
        assertEquals(2, chessKnight.chessKnight("h8"));
    }
}