package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String a[] = new String[10];
        int b[] = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++) {
            a[i] = bufferedReader.readLine();
            b[i] = a[i].length();
        }

        for (int c : b) {
            System.out.println(c);
        }
    }
}
