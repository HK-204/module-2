package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testCheckTriangle0() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giac deu".toLowerCase();
        String result = TriangleClassifier.checkTriangle(a, b, c).toLowerCase();
        assertEquals(expected, result);
    }

    @Test
    void testCheckTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giac can".toLowerCase();
        String result = TriangleClassifier.checkTriangle(a, b, c).toLowerCase();
        assertEquals(expected, result);
    }

    @Test
    void testCheckTriangle2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giac thuong".toLowerCase();
        String result = TriangleClassifier.checkTriangle(a, b, c).toLowerCase();
        assertEquals(expected, result);
    }

    @Test
    void testCheckTriangle3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Khong phai tam giac".toLowerCase();
        String result = TriangleClassifier.checkTriangle(a, b, c).toLowerCase();
        assertEquals(expected, result);
    }

    @Test
    void testCheckTriangle4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Khong phai tam giac".toLowerCase();
        String result = TriangleClassifier.checkTriangle(a, b, c).toLowerCase();
        assertEquals(expected, result);
    }

    @Test
    void testCheckTriangle5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "khong phai tam giac".toLowerCase();
        String result = TriangleClassifier.checkTriangle(a, b, c).toLowerCase();
        assertEquals(expected, result);
    }
}