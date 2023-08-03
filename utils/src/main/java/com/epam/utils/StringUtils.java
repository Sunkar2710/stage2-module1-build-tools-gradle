package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        if (str == null || str.isEmpty()) {
            return false;
        }

        return Float.parseFloat(str) > 0;
    }
}
