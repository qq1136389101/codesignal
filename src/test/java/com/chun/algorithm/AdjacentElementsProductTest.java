package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdjacentElementsProductTest {

    @Test
    public void adjacentElementsProduct() {
        AdjacentElementsProduct adjacentElementsProduct = new AdjacentElementsProduct();
        assertEquals(40, adjacentElementsProduct.adjacentElementsProduct(new int[]{1, 2, 5, 8}));
        assertEquals(0, adjacentElementsProduct.adjacentElementsProduct(new int[]{-1, 0, 2}));
    }
}