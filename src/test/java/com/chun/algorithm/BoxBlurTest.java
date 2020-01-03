package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoxBlurTest {

    @Test
    public void boxBlur() {
        BoxBlur boxBlur = new BoxBlur();
        assertArrayEquals(new int[][]{{1}}, boxBlur.boxBlur(new int[][]{{1,1,1}, {1,7,1}, {1,1,1}}));
        assertArrayEquals(new int[][]{{28}}, boxBlur.boxBlur(new int[][]{{0,18,9}, {27,9,0}, {81,63,45}}));
        assertArrayEquals(new int[][]{{40,30}}, boxBlur.boxBlur(new int[][]{{36,0,18,9}, {27,54,9,0}, {81,63,72,45}}));
        assertArrayEquals(new int[][]{{5,4}, {4,4}}, boxBlur.boxBlur(new int[][]{{7,4,0,1}, {5,6,2,2}, {6,10,7,8}, {1,4,2,0}}));
        assertArrayEquals(new int[][]{{39,30,26,25,31}, {34,37,35,32,32}, {38,41,44,46,42}, {22,24,31,39,45}, {37,34,36,47,59}}, boxBlur.boxBlur(new int[][]{{36,0,18,9,9,45,27}, {27,0,54,9,0,63,90}, {81,63,72,45,18,27,0}, {0,0,9,81,27,18,45}, {45,45,27,27,90,81,72}, {45,18,9,0,9,18,45}, {27,81,36,63,63,72,81}}));
    }
}