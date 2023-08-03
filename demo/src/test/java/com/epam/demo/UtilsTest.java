package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    @Test
    void testNullArgument() {
        assertEquals(false, Utils.isAllPositiveNumbers(List.of()));
    }

    @Test
    void testEmptyArgument() {
        assertEquals(false, Utils.isAllPositiveNumbers(List.of()));
    }
    @Test
    void testAllPositiveArguments() {
        assertEquals(true, Utils.isAllPositiveNumbers(List.of("11.22", "2", "33", "87")));
    }

    @Test
    void testNotAllPositiveArguments() {
        assertEquals(false, Utils.isAllPositiveNumbers(List.of("-11.22", "2", "33", "87")));
    }
}
