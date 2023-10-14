package com.epam.demo;

import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isAllPositive = false;
        for (String element : args) {
            if (!StringUtils.isPositiveNumber(element)) {
                return isAllPositive;
            }
        }
        isAllPositive = true;
        return isAllPositive;
    }
}