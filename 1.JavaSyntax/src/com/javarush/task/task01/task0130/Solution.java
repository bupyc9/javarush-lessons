package com.javarush.task.task01.task0130;

/*
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
//        double c = (double) celsium;
        return (double) celsium * 9 / 5 + 32;
    }
}