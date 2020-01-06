package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardCellColorTest {

    @Test
    public void chessBoardCellColor() {
        ChessBoardCellColor chessBoardCellColor = new ChessBoardCellColor();
        assertTrue(chessBoardCellColor.chessBoardCellColor("A1", "C3"));
        assertFalse(chessBoardCellColor.chessBoardCellColor("A1", "H3"));
        assertFalse(chessBoardCellColor.chessBoardCellColor("A1", "A2"));
        assertFalse(chessBoardCellColor.chessBoardCellColor("B3", "H8"));
        assertFalse(chessBoardCellColor.chessBoardCellColor("C3", "B5"));
        assertTrue(chessBoardCellColor.chessBoardCellColor("G5", "E7"));
    }
}