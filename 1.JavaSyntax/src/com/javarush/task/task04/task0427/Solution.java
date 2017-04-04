package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        if (a < 1 || a > 999) {
            return;
        }

        if (a / 100 >= 1) {
            System.out.print(a % 2 == 0 ? "четное трехзначное число" : "нечетное трехзначное число");
        } else if (a / 10 >= 1) {
            System.out.print(a % 2 == 0 ? "четное двузначное число" : "нечетное двузначное число");
        } else {
            System.out.print(a % 2 == 0 ? "четное однозначное число" : "нечетное однозначное число");
        }
    }
}