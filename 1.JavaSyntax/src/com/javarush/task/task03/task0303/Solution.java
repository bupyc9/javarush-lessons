package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(1, 1.35));
        System.out.println(convertEurToUsd(4, 1.35));
    }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }
}
