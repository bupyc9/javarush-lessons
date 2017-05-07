package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        int min;
        if (inputStream.available() > 0) {
            min = inputStream.read();
        } else {
            min = 0;
        }

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data < min) {
                min = data;
            }
        }

        inputStream.close();
        System.out.println(min);
    }
}
