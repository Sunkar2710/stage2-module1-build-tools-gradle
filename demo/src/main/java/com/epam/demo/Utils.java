package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String arg : args) {
            if (Integer.parseInt(arg) < 0) return false;
        }
        return true;
    }
}