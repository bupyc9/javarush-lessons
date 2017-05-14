package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        String fileInput = args[1];
        String fileOutput = args[2];

        FileInputStream fileInputStream = new FileInputStream(fileInput);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutput);

        int solt = 10;
        while(fileInputStream.available() > 0) {
            if (mode.equals("-e")) {
                fileOutputStream.write(fileInputStream.read() + solt);
            } else if (mode.equals("-d")) {
                fileOutputStream.write(fileInputStream.read() - solt);
            }
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
