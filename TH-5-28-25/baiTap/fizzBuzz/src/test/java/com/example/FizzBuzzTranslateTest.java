package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testFizzBuzz0() {
        int number = 27;
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz1() {
        int number = 100;
        String expected = "Buzz";
        String actual = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz2() {
        int number = 150;
        String expected = "FizzBuzz";
        String actual = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz3() {
        int number = 22;
        String expected = "hai muoi hai";
        String actual = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz4() {
        int number = 38;
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void testFizzBuzz5() {
        int number = 58;
        String expected = "Buzz";
        String actual = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expected, actual);
    }
}