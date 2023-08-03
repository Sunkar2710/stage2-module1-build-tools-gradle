package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    void  testPositiveNumber() {
        assertEquals(true , StringUtils.isPositiveNumber("5"));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(false, StringUtils.isPositiveNumber("-1"));
    }
}
