package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int items[] = new int[15];

        for (int i = 0; i < items.length; i++) {
            items[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int cEven = 0;
        int cOdd = 0;
        for (int i = 0; i < items.length; i++) {
            if (i % 2 == 0) {
                cEven += items[i];
            } else {
                cOdd += items[i];
            }
        }

        if (cEven > cOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
