package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        int count = 0;
        while (inputStream.available() > 0) {
            char c = (char) inputStream.read();
            if (Pattern.matches("[a-zA-Z]", String.valueOf(c))) {
                count++;
            }
        }

        System.out.println(count);
        inputStream.close();
    }
}
