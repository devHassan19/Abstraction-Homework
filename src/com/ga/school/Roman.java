package com.ga.school;

import java.util.*;

public class Roman {

    public static String intToRoman(int value) {
        int total = 0;
        String word = "";
        // Here, we're returning an empty string, but you need to build your
        // algorithm and return a String data type accordingly.

        Map<String, Integer> symbolValue = new LinkedHashMap<String, Integer>();
        symbolValue.put("M", 1000);
        symbolValue.put("D", 500);
        symbolValue.put("C", 100);
        symbolValue.put("L", 50);
        symbolValue.put("X", 10);
        symbolValue.put("V", 5);
        symbolValue.put("I", 1);

        while (total < value) {
            for (Map.Entry<String, Integer> entry : symbolValue.entrySet()) {
                if (entry.getValue() + 2 <= value) {
                    String subSymbol = entry.getKey() + entry.getKey();
                    int subVal = entry.getValue();
                    total += entry.getValue();
                    word = word + entry.getKey();
                } else if (total + entry.getValue() <= value) {
                    total += entry.getValue();
                    word = word + entry.getKey();
                }

            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));

//        Input: num = 3
//        Output: III
//
//        Input: num = 4
//        Output: IV
//
//        Input: num = 9
//        Output: IX
//
//        Input: num = 58
//        Output: LVIII
//        Explanation: L = 50, V = 5, III = 3.
//
//
//        Input: num = 1994
//        Output: MCMXCIV
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    }
}