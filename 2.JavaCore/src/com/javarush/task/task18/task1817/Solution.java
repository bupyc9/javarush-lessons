package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        int countAll = 0;
        int countSpace = 0;
        while (inputStream.available() > 0) {
            String s = String.valueOf((char) inputStream.read());
            if (s.equals(" ")) countSpace++;
            countAll++;
        }

        System.out.println(String.format("%(.2f", (double) countSpace / countAll * 100));
        inputStream.close();
    }
}
