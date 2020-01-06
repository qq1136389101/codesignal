package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinesweeperTest {

    @Test
    public void minesweeper() {
        Minesweeper minesweeper = new Minesweeper();
        assertArrayEquals(new int[][]{{1,2,1}, {2,1,1}, {1,1,1}}, minesweeper.minesweeper(new boolean[][]{{true,false,false}, {false,true,false}, {false,false,false}}));
        assertArrayEquals(new int[][]{{0,0,0}, {0,0,0}}, minesweeper.minesweeper(new boolean[][]{{false,false,false}, {false,false,false}}));
        assertArrayEquals(new int[][]{{0,2,2,1}, {3,4,3,3}, {1,2,3,1}}, minesweeper.minesweeper(new boolean[][]{{true,false,false,true}, {false,false,true,false}, {true,true,false,true}}));
        assertArrayEquals(new int[][]{{3,5,3}, {5,8,5}, {3,5,3}}, minesweeper.minesweeper(new boolean[][]{{true,true,true}, {true,true,true}, {true,true,true}}));
    }
}