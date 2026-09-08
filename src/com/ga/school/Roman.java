package com.ga.school;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Roman {

    public static String intToRoman(int value) {
        int total= 0;
        String word = "";
        // Here, we're returning an empty string, but you need to build your
        // algorithm and return a String data type accordingly.

        Map<String, Integer> symbolValue = new LinkedHashMap<String, Integer>();
        symbolValue.put("M", 1000);
        symbolValue.put("CM", 900);
        symbolValue.put("D", 500);
        symbolValue.put("CD", 400);
        symbolValue.put("C", 100);
        symbolValue.put("XC", 90);
        symbolValue.put("L", 50);
        symbolValue.put("XL", 40);
        symbolValue.put("X", 10);
        symbolValue.put("IX", 9);
        symbolValue.put("V", 5);
        symbolValue.put("IV", 4);
        symbolValue.put("I", 1);

       while (total < value) {
           for (Map.Entry<String, Integer> entry : symbolValue.entrySet()) {
               if(total + entry.getValue() <= value){
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
    }
}
