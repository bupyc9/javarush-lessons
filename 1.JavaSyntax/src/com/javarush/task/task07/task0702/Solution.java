package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string[] = new String[10];
        for (int i = 0; i < 8; i++) {
            string[i] = bufferedReader.readLine();
        }

        for (int i = string.length - 1; i >= 0; i--) {
            System.out.println(string[i]);
        }
    }
}