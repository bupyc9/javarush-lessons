package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (
            (a + b) > c
            && (a + c) > b
            && (b + c) > a
        ) {
            System.out.print("Треугольник существует.");
        } else {
            System.out.print("Треугольник не существует.");
        }
    }
}