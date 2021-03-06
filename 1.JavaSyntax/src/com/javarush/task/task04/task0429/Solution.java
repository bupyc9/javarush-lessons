package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[3];
        a[0] = Integer.parseInt(bufferedReader.readLine());
        a[1] = Integer.parseInt(bufferedReader.readLine());
        a[2] = Integer.parseInt(bufferedReader.readLine());

        int countPositive = 0, countNegative = 0;
        for (int n : a) {
            if (n > 0) {
                countPositive++;
            } else if (n < 0) {
                countNegative++;
            }
        }

        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
