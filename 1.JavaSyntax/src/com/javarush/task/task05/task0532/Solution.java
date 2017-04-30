package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine());
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                int v = Integer.parseInt(reader.readLine());
                if (v > maximum) {
                    maximum = v;
                }
            }
        }

        System.out.println(maximum);
    }
}
