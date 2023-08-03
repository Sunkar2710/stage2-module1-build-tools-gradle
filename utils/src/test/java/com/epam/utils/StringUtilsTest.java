package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    void testNullArgument() {
        assertEquals(false, StringUtils.isPositiveNumber(null));
    }
    @Test
    void testEmptyArgument() {
        assertEquals(false, StringUtils.isPositiveNumber(""));
    }
    @Test
    void testZeroArgument() { assertEquals(false, StringUtils.isPositiveNumber("0"));}
    @Test
    void  testPositiveArgument() {
        assertEquals(true , StringUtils.isPositiveNumber("1.1"));
    }

    @Test
    void testNegativeArgument() {
        assertEquals(false, StringUtils.isPositiveNumber("-1.1"));
    }
}
