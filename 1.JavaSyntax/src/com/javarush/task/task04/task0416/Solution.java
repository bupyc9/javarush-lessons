package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());

        for (int i = 0; i < 60; i = i + 5) {
            if (i <= t && t < 3 + i) {
                System.out.println("зелёный");
            } else if (3 + i <= t && t < 4 + i) {
                System.out.println("желтый");
            } else if (4 + i <= t && t < 5 + i) {
                System.out.println("красный");
            }
        }
    }
}