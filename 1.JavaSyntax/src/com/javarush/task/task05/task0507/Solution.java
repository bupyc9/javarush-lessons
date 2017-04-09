package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int c = 0;
        int s = 0;
        while (true) {
            int a = Integer.parseInt(bufferedReader.readLine());

            if (a == -1) {
                break;
            }

            c++;
            s += a;
        }

        System.out.print((double) s / c);
    }
}

