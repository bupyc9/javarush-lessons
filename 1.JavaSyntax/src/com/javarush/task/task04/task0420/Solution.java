package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];
        a[0] = Integer.parseInt(bufferedReader.readLine());
        a[1] = Integer.parseInt(bufferedReader.readLine());
        a[2] = Integer.parseInt(bufferedReader.readLine());

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[j + 1]) {
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }

        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
