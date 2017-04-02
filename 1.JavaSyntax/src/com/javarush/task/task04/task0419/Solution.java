package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        int max1 = max(a, b);
        int max2 = max(c, d);

        if (max1 > max2) {
            System.out.print(max1);
        } else {
            System.out.print(max2);
        }
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
