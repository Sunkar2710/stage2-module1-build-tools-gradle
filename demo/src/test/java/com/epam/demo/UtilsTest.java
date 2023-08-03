package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    @Test
    void testAllPositiveArguments() {
        assertEquals(true, Utils.isAllPositiveNumbers(List.of("1", "4", "5", "6", "7", "9")));
    }

    @Test
    void testNotAllPositiveArguments() {
        assertEquals(false, Utils.isAllPositiveNumbers(List.of("1", "4", "5", "6", "7", "-9")));
    }
}
